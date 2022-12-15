import java.io.*;
import java.util.*;

public class Challange_02{

        public static void main(String args []){

            Scanner scan =new Scanner(System.in);

            String input = scan.nextLine();
            boolean result = validator(input);
            System.out.println(result);


    }

    static boolean validator(String textString){

        Stack<Character> textLine = new Stack<Character>();
        for(char textChar: textString.toCharArray() ){

            textLine.push(textChar);

        }

        int checkBalancer = 0;

        for(int i=0;i<textString.length();i++){
        char charac=textLine.pop();

        if(charac=='}'){
            checkBalancer++;
        }
        if(charac==']'){
            checkBalancer++;
        }
        if(charac==')'){
            checkBalancer++;
        }

        if(charac=='{'){
            checkBalancer--;
        }
        if(charac=='['){
            checkBalancer--;
        }
        if(charac=='('){
            checkBalancer--;
        }
        }

        if(checkBalancer==0){
            return true;
        }
        else{
            return false;
        }

    }

        }

    