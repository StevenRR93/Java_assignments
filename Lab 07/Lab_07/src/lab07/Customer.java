package lab07;
/*
 *Steven Ramirez
 *ECE 251
 *Lab 07
 */

import java.io.Serializable;
public class Customer implements Serializable {
	private String	name;
	private int		age;
	private char	sex;
	private double	money;
	
	
	public Customer() {
		this("", 0, 'M', 0.0f);
	}
	
	public Customer(String aName) {
		this(aName, 0, 'M', 0.0f);
	}
	
	public Customer(String aName, int anAge, char aSex) {
		this(aName, anAge, aSex, 0.0f);
	}
	
	public Customer(String aName, int anAge, char aSex, float aMoney) {
	    name = aName;
	    age = anAge;
	    sex = aSex;
	    money = aMoney;
	}
	
	public String	getName() { return name; }
	public int		getAge() { return age; }
	public char		getSex() { return sex; }
	public double	getMoney() { return money; }
	
	public void setName(String n) { name = n; }
	public void setAge(int a) { age = a; }
	public void setSex(char s) { sex = s; }
	public void setMoney(double m) { money = m; }
	
	
	public String toString() {
		String result = name + ": a " + age + " year old ";
		if (sex == 'F') 
			result += "fe";
		return result + "male with $" + money;
	}

	public boolean spend(float amount) {
		if (money < amount)
			return false;
		money -= amount;
		return true;
	}
	public void give(Customer c, float amount) {
		if (money >= amount) {
			money -= amount;
			c.money += amount;
		}
	}
	public float computeFee() {
		if (age <= 3)
			return 0;
		if (age < 18)
			return 8.50f;
		if (age >= 65)
			return 12.75f * 0.50f;
		
		return 12.75f;
	}
	
/*	public void saveTo(java.io.PrintWriter aFile) throws java.io.IOException { 
	aFile.println(name +"," + age + "," + sex + "," + money); 
	 }
	 
	public static Customer readFrom(java.io.BufferedReader aFile) throws java.io.IOException { 
	Customer c= new Customer();
	String[] tokens = aFile.readLine().split(",");
	
	c.setName(tokens[0]);
	c.setAge(Integer.parseInt(tokens[1]));
	c.setSex(tokens[2].charAt(0));
	c.setMoney(Float.parseFloat(tokens[3]));
	
	return c;		
	}
	*/	
}