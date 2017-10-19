/*
 *Steven Ramirez
 *ECE 251
 *Lab 02
 */
 
 import java.util.Scanner;
 
 public class Robot {
 	int x;
 	int y;
 	double theta;
 	int d;
 	double newx;
 	double newy;
 	
 	public void display() {
 	
 		Scanner scanner= new Scanner(System.in);
 		System.out.print("Enter the x value: ");
 		x= scanner.nextInt();
 		System.out.print("Enter the y value: ");
 		y= scanner.nextInt();
 		System.out.print("Enter the angle the robot turns (in degrees): ");
 		theta= scanner.nextDouble();
 		theta= theta*Math.PI/180;
 		System.out.print("Enter the distance the robot moves: ");
 		d= scanner.nextInt();
 		newx= x + d*Math.cos(theta);
 		newy= y + d*Math.sin(theta);
 		System.out.printf("The new location is: (%4.2f",newx);
 		System.out.printf(",%4.2f)",newy);
 	}
 }