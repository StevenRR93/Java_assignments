/*
 *Steven Ramirez
 *ECE 251
 *Assignment 1
 *January 29, 2012
 */
 
 import java.util.Scanner;
 
 public class ChocolateBars {
 	//define the variables
 	int boxOH;
 	int boxCC;
 	int boxAE;
 	int boxSM;
 	int boxCR;
 	float subtotal;
 	float tax;
 	float total;
 	
 	public void display() {
 		//initialize the Scanner
 		Scanner scanner= new Scanner(System.in);
 		//create the price display
 		System.out.println("1. Oh Henry $0.65");
 		System.out.println("2. Coffee Crisp $0.80")	;
 		System.out.println("3. Aero $0.60");	
 		System.out.println("4. Smarties $0.70");
 		System.out.println("5. Crunchie $0.75");
 		//accept the user input
 		System.out.println("How many boxes of type (1) would you like (48 bars per box)?: ");	
 		boxOH= scanner.nextInt();
 		System.out.println("How many boxes of type (2) would you like (48 bars per box)?: ");	
 		boxCC= scanner.nextInt();
 		System.out.println("How many boxes of type (3) would you like (48 bars per box)?: ");	
 		boxAE= scanner.nextInt();
 		System.out.println("How many boxes of type (4) would you like (48 bars per box)?: ");	
 		boxSM= scanner.nextInt();
 		System.out.println("How many boxes of type (5) would you like (48 bars per box)?: ");	
 		boxCR= scanner.nextInt();
 		
 	}
 	public void amount() {
 		//calculate the price for each order and display the orders
 		float boxOHamt=boxOH*.65f*48f;
 		System.out.printf(boxOH+" boxes of Oh Henry ($0.65 x 48)= $%4.2f \n",boxOHamt);
 		float boxCCamt=boxCC*.80f*48f;
 		System.out.printf(boxCC+" boxes of Coffee Crisp ($0.80 x 48)= $%4.2f \n", boxCCamt);
 		float boxAEamt=boxAE*.60f*48f;
 		System.out.printf(boxAE+" boxes of Aero ($0.60 x 48)= $%4.2f \n", boxAEamt);
 		float boxSMamt=boxSM*.70f*48f;
 		System.out.printf(boxSM+" boxes of Smarties ($0.70 x 48)= $%4.2f \n", boxSMamt);
 		float boxCRamt=boxCR*.75f*48f;
 		System.out.printf(boxCR+" boxes of Crunchies ($0.75 x 48)= $%4.2f \n",boxCRamt);
 		System.out.println("----------------------------------------------");
 		//display the total prices
 		subtotal=boxOHamt+boxCCamt+boxAEamt+boxSMamt+boxCRamt;
 		System.out.printf("Sub Total = $%4.2f \n", subtotal);
 		tax=subtotal*.07f;
 		System.out.printf("Tax = $%4.2f \n", tax);
 		System.out.println("==============================================");
 		total=subtotal+tax;
 		System.out.printf("Amount Due = $%4.2f \n", total);
 	}
 }