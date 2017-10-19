/*
 *Steven Ramirez
 *ECE 251
 *Lab 07
 */
 
import java.util.ArrayList;
import java.util.Iterator;

public class Store {
	private String      		 name;
    private ArrayList<Customer>  customers;

    public Store(String n) {
       name = n;
       customers = new ArrayList<Customer>();
    }

    public String getName() { return name; }
    public ArrayList<Customer> getCustomers() { return customers; }

    public void addCustomer(Customer c) {
		customers.add(c);
    }
    //record the purchase from a customer, and add the customer in the store record.
	public void recordPurchase(Customer c, float price) {
		if (!customers.contains(c))
			addCustomer(c);
		c.spend(price);
			
    }

    // List the customers
    public void listCustomers() {
    	for (Customer c: customers)
    		System.out.println(c);
    }

    // Returns a new arraylist of all customers of the store that have the
    // same sex as the one specified in the parameter.
	public ArrayList<Customer> getCustomersOfSex(char sex) {
		ArrayList<Customer> cust = new ArrayList<Customer>();
		if (sex == 'm' || sex == 'M')
		{
			for (Customer c: customers){
				if (c.getSex() == 'm' || c.getSex() == 'M')
					cust.add(c);
			}
		}
		else if (sex == 'f' || sex == 'F')
		{
			for (Customer c: customers){
				if (c.getSex() == 'f' || c.getSex() == 'F')
					cust.add(c);
			}
		}
		else
			System.out.println("Invalid sex");
		return cust;
	}

    // Remove all customers from the store that are broke (i.e., have < $10)
	public void removeBrokeCustomers() {
		Iterator custIterator = customers.iterator();
		Customer c = new Customer();
		while (custIterator.hasNext()){
			c= (Customer)custIterator.next();
			if (c.getMoney() <= 10.0f)
    			custIterator.remove();
		}
	}


    // Return all customers in the store that have the same sex and are within the
    // same age group (i.e., +- 3 years of age) as the one specified.
	public ArrayList<Customer> friendsFor(Customer match) {
		ArrayList<Customer> matches = new ArrayList<Customer>();
		Iterator custIterator = customers.iterator();
		Customer c = new Customer();
		while (custIterator.hasNext()){
			c= (Customer)custIterator.next();
			if (c.getSex() == match.getSex() && c.getAge() <= (match.getAge()+3) && c.getAge() >= (match.getAge()-3) && c != match){
					matches.add(c);
			}
		}
		return matches;
	}

	public void saveTo(java.io.DataOutputStream aFile) throws java.io.IOException { ... }
}