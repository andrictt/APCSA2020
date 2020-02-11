package Unit4;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		out.println("Enter the original bill amount :: 500");
		out.println("Bill after discount :: " + String.format("%.2f",Discount.getDiscountedBill(500)));
		out.println();
		
		out.println("Enter the original bill amount :: 2500");
		out.println("Bill after discount :: " + String.format("%.2f",Discount.getDiscountedBill(2500)));
		out.println();
		
		out.println("Enter the original bill amount :: 4000");
		out.println("Bill after discount :: " + String.format("%.2f",Discount.getDiscountedBill(4000)));
		out.println();
		
		out.println("Enter the original bill amount :: 333.333");
		out.println("Bill after discount :: " + String.format("%.2f",Discount.getDiscountedBill(333.33)));
		out.println();
		
		Scanner keyboard = new Scanner(System.in);
		out.println("Enter the original bill amount :: ");
		double amt = keyboard.nextDouble();
		out.println("Bill after discount :: " + String.format("%.2f",Discount.getDiscountedBill(amt)));
		out.println();
		

	}
}