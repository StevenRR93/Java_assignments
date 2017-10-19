/*
 *Steven Ramirez
 *ECE 251
 *Assignment 1
 *January 29, 2012
 */

import java.util.Scanner;
public class StarDisplayTest {
    public static void main(String args[]) {
    	int a;
        StarDisplay s = new StarDisplay( );
        //gather user imput
        Scanner scanner =new Scanner(System.in);
        System.out.println("Please enter a 5 digit positive number:");
        a= scanner.nextInt();
        //run the program
        s.displayStar(a);
    }
}
