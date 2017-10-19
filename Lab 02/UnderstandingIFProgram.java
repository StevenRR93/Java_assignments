/*
 *Steven Ramirez
 *ECE 251
 *Lab 02
 */
 
public class UnderstandingIFProgram{        
	private char input;
	private boolean male;	

public void question(){
	System.out.print("Are you (M)ale or (F)emale ? ... ");
	input = new java.util.Scanner(System.in).nextLine().charAt(0);
       
	male = (input == 'M') || (input == 'm');
            
	if (!male)
   		System.out.println("OK, now I know that you are a female.");
	else
   		System.out.println("OK, now I know that you are a male.");
}
}
