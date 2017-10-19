/*
 *Steven Ramirez
 *ECE 251
 *Assignment 2
 *February 7, 2013
 */
 
public class PersonTester {
	public static void main(String args[]) {
		Person mary = new Person(4.9f, 20.0f);
		//test the program
		System.out.println(mary.getHeight());
		System.out.println(mary.getMoney());
		System.out.println(mary.getTicketCount());
		System.out.println(mary.getHasPass());
		System.out.println(mary);
		mary.setTicketCount(3);
		System.out.println(mary);
		mary.useTickets(2);
		System.out.println(mary);
		mary.setPass(true);
		System.out.println(mary);
	}
}