/*
 *Steven Ramirez
 *ECE 251
 *Lab 04
 */

public class CustomerTestProgram {
    public static void main(String args[]) {
        Customer c = new Customer();
        c.setName("Steve");
        c.setMoney(20);
        c.admit();
           
        System.out.println(c.getName());
        System.out.println(c.getMoney());
        System.out.println(c.isAdmitted());
    }
}
