package Challange_05;

public class Thread2{
	
	
	synchronized void ePFCalc() {
		
		Main.ePFEmployee = (Main.basicSalary/100)*8;
		
		try {
			
			System.out.println("Thread 2 waiting for main thread to complete...!");
			Main.ePFEmpeeDone = true;
			wait();
			
		} 
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Main.ePFEmployer = (Main.totalSalary/100)*12;
		
		try {
			
			System.out.println("Thread 2 waiting for main thread to complete...!");
			Main.ePFEmperDone = true;
			Thread.sleep(2000);
			
		} 
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Main.TotalEPF = Main.ePFEmployee + Main.ePFEmployer;
		
		System.out.println("Main thread ended...!");
		Main.totalEPFDone = true;
		
		
	}

}
