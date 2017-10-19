/*
 *Steven Ramirez
 *ECE 251
 *Lab 03
 */

public class CustomerTestProgram {
    public static void main(String args[]) {
        Customer c1 = new Customer();
        c1.name = "Bob";
        c1.age = 17;
        c1.money = 10;
        Customer c2 = new Customer();
        c2.name = "Dottie";
        c2.age = 3;
        c2.money = 0;
        Customer c3 = new Customer();
        c3.name = "Steve";
        c3.age = 67;
        c3.money = 30;
        Customer c4 = new Customer();
        c4.name = "Jane";
        c4.age = 64;
        c4.money = 0;

System.out.println("Here is the situation before going into the circus:");
System.out.println("  Bob has $" + c1.money);
System.out.println("  Dottie has $" + c2.money);
System.out.println("  Steve has $" + c3.money);
System.out.println("  Jane has $" + c4.money);

// Simulate people going into the circus
c1.payAdmission();
System.out.println(c1.name+"'s admittance was "+c1.admitted);
c2.payAdmission();
System.out.println(c2.name+"'s admittance was "+c2.admitted);
c3.payAdmission();
System.out.println(c3.name+"'s admittance was "+c3.admitted);
c4.payAdmission();
System.out.println(c4.name+"'s admittance was "+c4.admitted);
c3.give(c4, 15);
c4.payAdmission();
System.out.println(c4.name+"'s admittance was "+c4.admitted);

System.out.println("Here is the situation after going into the circus:");
System.out.println("  Bob has $" + c1.money);
System.out.println("  Dottie has $" + c2.money);
System.out.println("  Steve has $" + c3.money);
System.out.println("  Jane has $" + c4.money);
}
}




