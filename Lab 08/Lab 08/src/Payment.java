/*
 * Steven Ramirez
 * ECE 251
 * Lab 08 
 */

public class Payment {
	private double amount;
	
	public Payment(){
		amount=0;
	}
	
	public Payment(double aAmount){
		amount= aAmount;
	}
	
	public double getAmount(){ return amount; }
	
	public void setAmount(double a){
		amount= a;
	}
	
	public String paymentDetails(){
		String paydetails= "The amount of the payment is: $" + getAmount();
		return paydetails;
	}
}
