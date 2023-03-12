
import com.openai.api.gpt.ChatGPT;
public class ChatBot {
	public static void main(String[] args) {

        ChatGPT chatbot = new ChatGPT("<YOUR API KEY>");

        String userMessage = "Hello, can you tell me a joke?";
        String response = chatbot.generateResponse(userMessage);

        System.out.println(response);
    }

}
