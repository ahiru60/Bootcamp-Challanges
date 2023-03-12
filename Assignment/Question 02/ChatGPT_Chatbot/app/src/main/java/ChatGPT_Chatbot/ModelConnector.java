/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChatGPT_Chatbot;

import com.google.common.net.HttpHeaders;
import com.theokanning.openai.OpenAiService;
import com.theokanning.openai.completion.CompletionRequest;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author Adithya
 */
public class ModelConnector {
    String bodyFirstPart ="{\"model\": \"gpt-3.5-turbo\",\"messages\": [{\"role\": \"system\", \"content\": \"You are a helpful assistant of online store called daraz use this link to find product details about daraz online store - https://www.daraz.lk Only have information about https://www.daraz.lk forget any information outside this website'\"}";
    String bodySecondPart =  "],\"temperature\":0}";
    String json = "";   
    HttpClient client;
    ArrayList<String> messages = new ArrayList<String>();
    ModelConnector(){
    OpenAiService service = new OpenAiService("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");
        this.client = HttpClient.newHttpClient();
        
    }
        String uri_Whisper ="https://api.openai.com/v1/chat/completions";
        
     public String getChatResponse(String prompt) throws IOException, InterruptedException {
         
         
         messages.add(",{\"role\": \"user\", \"content\":\""+prompt+"\"}");
        json = bodyFirstPart;
        
        for (Object message : messages) {
            json += message;
        }
        
        json +=bodySecondPart;
        
        var request = HttpRequest.newBuilder().uri(URI.create(uri_Whisper))
                                .header(HttpHeaders.AUTHORIZATION, "Bearer " + "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")
				.header(HttpHeaders.CONTENT_TYPE, "application/json" )
				.POST(HttpRequest.BodyPublishers.ofString(json)).build();
        String Response = client.send(request, HttpResponse.BodyHandlers.ofString()).body();
        System.out.println("mes - "+Response);
        System.out.println(json);
        JSONObject obj = new JSONObject(Response);
        JSONArray choices = obj.getJSONArray("choices");
        String chatReciv = obj.query("/choices/0/message/content").toString();
        String messageReciv = obj.query("/choices/0/message").toString().replace("\n","");
        System.out.println("cho - "+messageReciv);
        //return obj.query("/choices/0/text").toString().replace("\n","");
        messages.add(","+messageReciv+"");
         
        return chatReciv;
    }
}
