import java.util.*;
class Challange_03{

    public static void main(String[]args){

        int[] numbers ={47,84,75,21,14,14,79};
        System.out.println(numProcess(numbers));


    }

    public static String numProcess(int[]input){
        int temp = 0;
    for(int j=0;j<input.length-1;j++){
        for(int i=0;i<input.length-1;i++){

            if(input[i]>input[i+1]){

                temp=input[i];
                input[i] = input[i+1];
                input[i+1]=temp;

            }

        }
    }
    // finding the heighest value
    int lastIndex = input[6];
    System.out.println("Heighest value is "+lastIndex+"\n");

    //finding the median
    int median = 0;
    int medianPoint = 0;
    if(input.length%2!=0){
        int prevToMedianPoint = input.length/2;
        int nextToMedianPoint = (input.length/2)+1;

        medianPoint = 2/(input[prevToMedianPoint]+input[nextToMedianPoint]);

    }
    else{

        medianPoint =input.length/2;
    }

    System.out.println("Median value is "+input[medianPoint]+"\n");

    //finding the Mode
    int maxCount =0; int mode = 0;
    for(int j=0;j<input.length-1;j++){
        int count =0;
        for(int i=0;i<input.length-1;i++){

            if(input[j]==input[i]){
                count++;
            }

        }
        if(count>maxCount){
            maxCount = count;
            mode = input[j];
        }
    }
    System.out.println("Mode value is "+mode+" and value has repeated "+maxCount+" times\n");

    //finding prime numbers

    //int[] primeNumbers={};
    List<Integer> primeNumbers = new ArrayList<Integer>();
    
    for(int i=0;i<input.length-1;i++){

        int isPrimeCount = 0;

        if(input[i]<=1){

            continue;

        }else{

            
            for (int j = 2; j<= input[i]/2; j++){
                if ((input[i] % j) == 0){
            
                    break;

                    }else{
                        
                        
                        isPrimeCount++;    
                            
                        

                    }
            }

        }
        if(input[i]/2==isPrimeCount+1){
            primeNumbers.add(input[i]);
        }
        
    }
    System.out.print("Primary numbers :[");
    int prevNumber = -1;
    for(int number: primeNumbers){

        if(prevNumber!=number){
        System.out.print(" "+number+" ");
        prevNumber =number;
        }

    }
    System.out.println("]");

    return "Sorted array :"+Arrays.toString(input)+"\n";

    }

}