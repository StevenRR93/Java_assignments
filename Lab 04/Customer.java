/*
 *Steven Ramirez
 *ECE 251
 *Lab 04
 */
 
 public class Customer {
    private String     name;
    private int        age;
    private char       sex;
    private float      money;
    private boolean    admitted;
    
    public Customer() {
    this("", 0, 'M', 0.0f, false);
	}
    
    public Customer(String aName) {
    this(aName, 0, 'M', 0.0f, false);
	}

	public Customer(String aName, int aAge, char aSex) {
    this(aName, aAge, aSex, 0.0f, false);
	}

	public Customer(String aName, int aAge, char aSex, float aMoney, boolean aAdmit ) {
    name = aName;
    age = aAge;
    sex = aSex;
    money = aMoney;
    admitted = aAdmit;
	}
	
	public String toString() {
	if (sex== 'M' || sex== 'm' && admitted == false)	
    return ("Customer "+name+": a "+age+" year old Male with $"+money+" who has not been Admitted: ");
    else if (sex== 'M' || sex== 'm' && admitted == true)	
    return ("Customer "+name+": a "+age+" year old Male with $"+money+" who has been Admitted: ");
    else if (sex== 'F' || sex== 'f' && admitted == false)	
    return ("Customer "+name+": a "+age+" year old Female with $"+money+" who has not been Admitted: ");
    else if (sex== 'F' || sex== 'f' && admitted == true)	
    return ("Customer "+name+": a "+age+" year old Female with $"+money+" who has been Admitted: ");
    else
    return ("Invalid sex");	
	}
	
	public String getName() { return name; }
	
	public int getAge() { return age; }
	
	public char getSex() { return sex; }
	
	public float getMoney() { return money; }
	
	public boolean isAdmitted() { return admitted; }
	
	public void setName(String  a) {  name = a; }
	
	public void setAge(int  a) {  age = a; }
	
	public void setSex(char  a) {  sex = a; }
	
	public void setMoney(float  a) {  money = a; }
	
	public void admit() { admitted = true; }
	public void deny() {admitted = false; }
	public void toggleAdmittance() { admitted = !admitted; }

	
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
    public void payAdmission() {
        if (spend(computeFee()))
            admitted = true;
    }
}
