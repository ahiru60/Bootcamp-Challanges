import java.util.thread;

class Challange_05{


   

    public static void main(String[] args){
        
        MainThread basicSal  = new MainThread();
        basicSal.run();
        Thread1 allowence = new Thread1();
        allowence.start();

    }


}

class MainThread extends Thread{

public void run(){
    
    salary = perDayPayment*noOfDays;
   }   
}

class Thread1 extends Thread{
float allowence =0;
public float run(float basicSal){
    
    allowence = (basicSal/100)*5;
}
    
}

