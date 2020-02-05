package Unit3;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Andric Li
//Date - 2/2/20
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MPHRunner
{
	public static void main( String[] args )
	{
		out.println("Enter the distance :: 45");
		out.println("Enter the hours :: 0");
		out.println("Enter the minutes :: 32");
		MilesPerHour test = new MilesPerHour(45, 0, 32);
		test.calcMPH();
		test.print();
		out.println();
		
		out.println("Enter the distance :: 96");
		out.println("Enter the hours :: 1");
		out.println("Enter the minutes :: 43");
		test.setNums(96, 1, 43);
		test.calcMPH();
		test.print();
		out.println();
		
		out.println("Enter the distance :: 100");
		out.println("Enter the hours :: 2");
		out.println("Enter the minutes :: 25");
		test.setNums(100, 2, 25);
		test.calcMPH();
		test.print();
		out.println();
		
		out.println("Enter the distance :: 50");
		out.println("Enter the hours :: 2");
		out.println("Enter the minutes :: 25");
		test.setNums(50, 2, 25);
		test.calcMPH();
		test.print();
		out.println();
		
		Scanner keyboard = new Scanner(in);
		
		out.println("Enter the distance :: ");
		int dist = keyboard.nextInt();

		out.println("Enter the hours :: ");
		int hrs = keyboard.nextInt();

		out.println("Enter the minutes :: ");
		int mins = keyboard.nextInt();

		test.setNums(dist, hrs, mins);
		test.calcMPH();
		test.print();
		
		//add more test cases
		
		
	}
}