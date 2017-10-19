/*
 *Steven Ramirez
 *ECE 251
 *Lab 05
 */

public class ArrayTestProgram1 {
    public static void main(String args[]) {
        int    total = 0;
        int[]  numbers = {1, 45, 23, 87, 89, 213, 54, 11, 76, 98, 23, 5};

        for (int i=0; i<12; i++){
        	total= total + numbers[i];
        }
        System.out.println("The total sum is: " + total);
        
	}
}
