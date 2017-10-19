/*
 *Steven Ramirez
 *ECE 251
 *Assignment 2
 *February 7, 2013
 */
 
 public class Person{
 	//define the instance variables
 	private float money;
 	private float height;
 	private int ticketCount;
 	private boolean hasPass;
 	
 	//create constructors
 	public Person(){
 	this(0f, 0f, 0, false);
 	}
 	
 	public Person( float aHeight, float aMoney){
 	this(aHeight, aMoney, 0, false);
 	}
 	
 	public Person(float aHeight, float aMoney, int aTicketCount, boolean aHasPass){
 	height= aHeight;
 	money= aMoney;
 	ticketCount= aTicketCount;
 	hasPass= aHasPass;
 	}
 	
 	//create default toString
 	public String toString(){
 	if (!getHasPass())	
 		return (getHeight()+" foot person with $" + getMoney() + " and " + getTicketCount()+ " tickets.");
 	else
 		return (getHeight()+" foot person with $" + getMoney() + " and a pass.");	
 	}
 	
 	//create get methods
 	public float getMoney(){ return money; }
 	
 	public float getHeight(){ return height; }
 	
 	public int getTicketCount(){ return ticketCount;}
 	
 	public boolean getHasPass(){ return hasPass; }
 	
 	//create set methods
 	public void setMoney(float a){
 	money=a;	
 	}
 	
 	public void setTicketCount(int a){
 	ticketCount=a;	
 	}
 	
 	public void setPass (boolean a){
 	hasPass=a;	
 	}
 	
 	//instance method that determines the ticket count
 	public void useTickets (int a){
 	if (ticketCount >= a)	
 		ticketCount=ticketCount-a;
 	else
 		System.out.println("Not enough tickets.");	
 	}
 	
 	//instance method that simulates a person buying tickets	
 	public boolean buyTickets(int aNumber, TicketBooth aBooth){
 		if (getMoney()>= aNumber*aBooth.TICKET_PRICE){	
 			setMoney(getMoney()-aNumber*aBooth.TICKET_PRICE);
 			setTicketCount(getTicketCount()+aNumber);
 			aBooth.soldTickets(aNumber);
 			return true;
 		}
 		return false;
 	}	
 	
 	//instance method that simulates a person buying a pass	
 	public boolean buyPass(TicketBooth aBooth){
 		if (getMoney()>= aBooth.PASS_PRICE && aBooth.getAvailablePasses()> 0){
 			setMoney(getMoney()-aBooth.PASS_PRICE);
 			setPass(true);
 			aBooth.soldPass();	
 		}
 		return getHasPass();	
 	}	
 	
 	//instance method that determines if a person is allowed to ride or not
 	public boolean allowedToRide(Ride aRide){
 		if ((getHasPass() || ticketCount >= aRide.getTicketsRequired())&& height >= aRide.getHeightRequirement()){
 			return true; 
 		}
 		return false;		
 	}
 	
 	//instance method that simulates a person getting on a ride
 	public void getOn(Ride aRide){
 		allowedToRide(aRide);
 		if (allowedToRide(aRide)){
 		ticketCount= ticketCount-aRide.getTicketsRequired();	
 		aRide.setNumberOfRiders(aRide.getNumberOfRiders()+1);	
 		}
 	}
 }