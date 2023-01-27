package Challange_05;
//import java.lang.*;

class Main{

	
	static float basicSalary = 0;
	static float perDayPay = 0;
	static int noOfDays = 0;
	static float allowance = 0;
	static float ePFEmployee = 0;
	static float ePFEmployer = 0;
	static float totalSalary =0;
	static float TotalEPF = 0;
	static boolean basicSalDone = false;
	static boolean allowenceDone = false;
	static boolean ePFEmperDone = false;
	static boolean ePFEmpeeDone = false;
	 static boolean totalEPFDone = false;
	static boolean totalSalaryDone = false;
	
	 
   

    public static void main(String[] args){
        
        perDayPay= 500;
        noOfDays=  30;
        
        
        ThreadMain basicSalCalc = new ThreadMain();
        Thread tMain = new Thread(new Runnable() {
         public void run() { basicSalCalc.basicSalCalc(); }});
        
        Thread2 ePF = new Thread2();
        Thread t2= new Thread(new Runnable() {
         public void run() { ePF.ePFCalc(); }});
        
        Thread1 allowCalc = new Thread1();
        Thread t1= new Thread(new Runnable() {
         public void run() { allowCalc.allowenceCalc(); }});
            
        System.out.println("Main thread starting...!");   
        tMain.start();
        
        while(true) {
        	
        	if(basicSalDone) {
        		
        		System.out.println("Thread 1 starting...!");
        		t1.start();
        		basicSalDone = false;
        		
        	}
        	if(allowenceDone) {
        		
        		System.out.println("Thread 2 starting...!");
        		t2.start();
        		allowenceDone = false;
        		
        	}
        	
        	if(ePFEmpeeDone) {
        		System.out.println("Main thread resuming...!");
        		
        		synchronized(tMain) {
        			tMain.notify();
        			}
        		ePFEmpeeDone = false;
        		
        	}
        	
        	if(ePFEmpeeDone) {
        		
        		System.out.println("Thread 2 resuming...!");
        		synchronized(t2) {
        		t2.notify();
        		ePFEmpeeDone = false;
        		
        	}
        	
        	if(totalEPFDone) {
        		System.out.println("Total Salary -" + totalSalary);
                System.out.println("Total Allowance -"+ allowance);
                System.out.println("Total EPF -" +ePFEmployee+ePFEmployer);
                totalEPFDone = false;
        	}
        	
        }
        
        
            
        /*Thread1 allowence = new Thread1();
        allowence.start();
        /*Thread2 ePF =new Thread2();
        ePF.start();
            */

    }


}
    }





