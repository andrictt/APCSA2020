package Unit4;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		//add in input
		System.out.println("Enter a whole number :: 111");
		System.out.println("5 is odd :: " + NumberVerify.isOdd(111));
		System.out.println("5 is even :: " + NumberVerify.isEven(111));
		System.out.println();
		
		System.out.println("Enter a whole number :: 2000");
		System.out.println("5 is odd :: " + NumberVerify.isOdd(2000));
		System.out.println("5 is even :: " + NumberVerify.isEven(2000));
		System.out.println();
		
		System.out.println("Enter a whole number :: -99");
		System.out.println("5 is odd :: " + NumberVerify.isOdd(-99));
		System.out.println("5 is even :: " + NumberVerify.isEven(-99));
		System.out.println();
		
		System.out.println("Enter a whole number :: 1111");
		System.out.println("5 is odd :: " + NumberVerify.isOdd(1111));
		System.out.println("5 is even :: " + NumberVerify.isEven(1111));
		System.out.println();
		
		System.out.println("Enter a whole number :: -850");
		System.out.println("5 is odd :: " + NumberVerify.isOdd(-850));
		System.out.println("5 is even :: " + NumberVerify.isEven(-850));
		System.out.println();
		//add in more test cases
	}
}