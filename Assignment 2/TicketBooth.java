/*
 *Steven Ramirez
 *ECE 251
 *Assignment 2
 *February 7, 2013
 */

public class TicketBooth {
	//define the instance variables
	private float moneyMade;
	private int availablePasses;
	//define the class constant
	public static float TICKET_PRICE=.50f;
	public static float PASS_PRICE=16.50f;
	//define the variables
	public int ticketssold;
	public int passessold;	

	//create constructors
	public TicketBooth(){
	this(0, 0.0f);
	}

	public TicketBooth(int aAvailablePasses){
	this(aAvailablePasses, 0.0f);	
	}
	
	public TicketBooth(int aAvailablePasses, float aMoneyMade){
	availablePasses = aAvailablePasses;
	moneyMade = aMoneyMade;	
	}
	
	//create default toString
	public String toString(){
	return ("Ticket Booth with " + availablePasses + " passes");
	}
	
	//create get methods
	public int getAvailablePasses(){ 
	return availablePasses;
	}
	
	public float getMoneyMade(){ 
	return moneyMade; 
	}
	
	//create set methods
	public void setAvailablePasses(int a){
	availablePasses=a;	
	}
	
	public void setMoneyMade(float a){
	moneyMade=a;	
	}
	
	//instance method that records the number of tickets sold and calculate the money made from a ticket purchase
	public int soldTickets(int num){
		ticketssold=ticketssold+num;
		setMoneyMade(getMoneyMade()+num*TICKET_PRICE);
		return ticketssold;	
	}
	
	//instance method that records the number of passes sold and calculate the money made from a pass purchase
	public int soldPass(){
		passessold=passessold+1;
		setAvailablePasses(getAvailablePasses()-1);
		setMoneyMade(getMoneyMade()+PASS_PRICE);
		return passessold;
	}
	
}