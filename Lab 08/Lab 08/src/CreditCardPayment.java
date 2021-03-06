/*
 * Steven Ramirez
 * ECE 251
 * Lab 08 
 */

public class CreditCardPayment extends Payment {
	private String name;
	private int number;
	private String expDate;
	
	public CreditCardPayment(){
		//this(super() ,"", 0, "00/00");
		
	}
	
	public CreditCardPayment(double aAmount, String aName, int aNumber, String aExpDate){
		super(aAmount);
		name= aName;
		number=aNumber;
		expDate=aExpDate;
	}
	
	public String paymentDetails(){
		String paydetails= super.paymentDetails()+ " with a credit card " +
				"with the following information: \nName: "+ name + "\nNumber: " 
				+ number+ "\nExpiration Date: "+ expDate;
		System.out.println(paydetails);
		return paydetails;
	}
}
