/*
 *Steven Ramirez
 *ECE 251
 *Assignment 2
 *February 7, 2013
 */

public class Ride {
	//define the instance variables
	private String name;
	private int ticketsRequired;
	private float heightRequirement;
	private int numberOfRiders;

	//create constructors
	public Ride(){
	this("", 0, 0.0f, 0);
	}

	public Ride(String aName, int aTicketsRequired, float aHeightRequirement)	{
	this(aName, aTicketsRequired, aHeightRequirement, 0);
	}
	
	public Ride(String aName, int aTicketsRequired, float aHeightRequirement, int aNumberOfRiders){
	name= aName;	
	ticketsRequired= aTicketsRequired;
	heightRequirement= aHeightRequirement;
	numberOfRiders= aNumberOfRiders;
	}
	
	//create default toString
	public String toString(){
	return (name + " requiring " + ticketsRequired + " tickets and height restriction " + heightRequirement+ " feet");
	}

	//create get methods
	public String getName(){ return name; }
	
	public int getTicketsRequired(){ return ticketsRequired; }
	
	public float getHeightRequirement(){ return heightRequirement; }
	
	public int getNumberOfRiders(){ return numberOfRiders; }
	
	//create set method
	public void setNumberOfRiders(int a){
	numberOfRiders=a;	
	}
	
}