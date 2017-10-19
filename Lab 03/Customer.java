/*
 *Steven Ramirez
 *ECE 251
 *Lab 03
 */

public class Customer {
    String  name;
    int     age;
    char    sex;
    float   money;
    boolean admitted;
    
    public boolean spend(float amount) {
    	boolean a;
        if (money - amount >= 0){
        money=money-amount;
        a=true;
        }
        else a=false;
        return a;
    }
    public void give(Customer c, float amount) {
    	c.money=c.money+amount;
    	money=money-amount;
    }
    public float computeFee(){
    	float fee;
    	if (age <= 3){
    		fee=0.00f;}
    	else if(age > 3 && age < 18){
    		fee=8.50f;}
    	else if(age > 65){
    		fee= 12.75f*.50f;}
    	else{
    		fee= 12.75f;}
    	return fee;
    }
    public void payAdmission(){
    	float fee=computeFee();
    	admitted=spend(fee);
    	spend(fee);
    }
}
