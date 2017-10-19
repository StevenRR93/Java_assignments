/*
 *Steven Ramirez
 *ECE 251
 *Assignment 1
 *January 29, 2012
 */


public class StarDisplay {
	public void displayStar(int number){ 
		int[] array= new int[10]; 
		int i=0;
		//The number is broken down into individual numbers and stored in an array	      
		while (number >=1) {
			array[i] = number%10;
			number = number/10;
			i++;
			}
		//displayStarHelper is called for each individual number from the array	
		for (int a=i-1; a>=0; a--)
		{
			displayStarHelper(array[a]);
		}	
	}
	
	public void displayStarHelper(int i){
	//The different cases are created for each individual number	
		switch (i){
			case 1:
				System.out.println("\n**************");
				System.out.println("**************");
				break;
			case 2:
				System.out.println("\n********    **");
				System.out.println("********    **");
				System.out.println("**    **    **");
				System.out.println("**    **    **");
				System.out.println("**    ********");	
				System.out.println("**    ********");	
				break;
			case 3:
				System.out.println("\n**    **    **");
				System.out.println("**    **    **");
				System.out.println("**    **    **");
				System.out.println("**    **    **");
				System.out.println("**************");
				System.out.println("**************");
				break;
			case 4:
				System.out.println("\n      ********");
				System.out.println("      ********");
				System.out.println("      **      ");
				System.out.println("      **      ");
				System.out.println("**************");
				System.out.println("**************");
				break;
			case 5:
				System.out.println("\n**    ********");
				System.out.println("**    ********");
				System.out.println("**    **    **");
				System.out.println("**    **    **");
				System.out.println("********    **");
				System.out.println("********    **");
				break;
			case 6:
				System.out.println("\n**************");
				System.out.println("**************");
				System.out.println("**    **    **");
				System.out.println("**    **    **");
				System.out.println("********    **");
				System.out.println("********    **");
				break;
			case 7:
				System.out.println("\n            **");
				System.out.println("            **");
				System.out.println("            **");
				System.out.println("            **");
				System.out.println("**************");
				System.out.println("**************");
				break;
			case 8:
				System.out.println("\n**************");
				System.out.println("**************");
				System.out.println("**    **    **");
				System.out.println("**    **    **");
				System.out.println("**************");
				System.out.println("**************");
				break;
			case 9:
				System.out.println("\n**    ********");
				System.out.println("**    ********");
				System.out.println("**    **    **");
				System.out.println("**    **    **");
				System.out.println("**************");
				System.out.println("**************");
				break;
			default:
				System.out.println("\n**************");
				System.out.println("**************");
				System.out.println("**          **");
				System.out.println("**          **");
				System.out.println("**************");
				System.out.println("**************");										
		}
	}
}
