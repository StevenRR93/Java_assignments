/*
 *Steven Ramirez
 *ECE 251
 *Lab 06
 */

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTestProgram2 {
    public static void main(String args[]) {
        ArrayList<Integer>  numbersArrayList = new 
		ArrayList<Integer>(java.util.Arrays.asList(1, 45, 23, 87, 89, 213, 54, 11, 76, 98, 23, 5));
        
		System.out.println("The ArrayList looks like this beforehand: " + numbersArrayList);
        
        Iterator numsIterator = numbersArrayList.iterator();
        
		while (numsIterator.hasNext()) {
			int num  = ((Integer)numsIterator.next()).intValue();
    		if (num%2 != 0)
        		numsIterator.remove();
		}
            
		System.out.println("The ArrayList looks like this afterwards: " + numbersArrayList);
	}
}
