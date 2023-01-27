package Challange_05;

class Thread1 {
	
synchronized void allowenceCalc(){
    
   Main.allowance = (Main.basicSalary/100)*5;
   System.out.println(Main.allowance);
   Main.allowenceDone = true;
   System.out.println("Thread 1 ended...!");
   /*Thread2 ePF = new Thread2();
   ePF.start();*/
   
}
    
}
