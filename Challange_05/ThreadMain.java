package Challange_05;

class ThreadMain{
	
	synchronized void basicSalCalc(){
    
    Main.basicSalary = Main.perDayPay*Main.noOfDays;

    try{
    	
    	System.out.println("Main thread waiting for Thread1 to complete...!");
    	Main.basicSalDone = true;
        wait();
    }
    catch(InterruptedException e){
        System.out.println("wait interrupted"+ e);
    }
   
    Main.totalSalary = (Main.basicSalary + Main.allowance)-Main.ePFEmployee;
    
    Main.totalSalaryDone = true;
    System.out.println("Main thread ended...!");
   }   
}
