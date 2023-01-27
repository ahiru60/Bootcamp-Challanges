package Challange_05;

public class Salary {

	private float basicSalary = 0;
	private float allowance = 0;
	private float ePF = 0;
	
	private float perDayPay = 0;
	private int noOfDays = 0;
	
	public void setBasicSal(float basicSalary) {
		
		this.basicSalary = basicSalary;
	}
	
public float getBasicSal() {
		
		return this.basicSalary;
	}

public void setAllowence(float allowance) {
	
	this.allowance = allowance;
}

public float getAllowance() {
	
	return this.allowance;
}

public void setePF(float ePF) {
	
	this.ePF = ePF;
}

public float getePF() {
	
	return this.ePF;
}

public void setPerDayPay(float perDayPay) {
	
	this.perDayPay = perDayPay;
}

public float getperDayPay() {
	
	return this.perDayPay;
}

public void setNoOfDays(int noOfDays) {
	
	this.noOfDays = noOfDays;
}

public int getNoOfDays() {
	
	return this.noOfDays;
}
	
}
