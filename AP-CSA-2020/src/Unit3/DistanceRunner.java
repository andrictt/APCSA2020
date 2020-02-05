package Unit3;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Andric Li
//Date - 2/3/20
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		out.println("Enter the x1:: 1");
		out.println("Enter the y1:: 1");
		out.println("Enter the x2:: 2");
		out.println("Enter the y2:: 1");
		Distance test = new Distance(1, 1, 2, 1);
		test.calcDistance();
		test.print();
		out.println("\n");
		
		out.println("Enter the x1:: 1");
		out.println("Enter the y1:: 1");
		out.println("Enter the x2:: -2");
		out.println("Enter the y2:: 2");
		test.setCoordinates(1, 1, -2, 2);
		test.calcDistance();
		test.print();
		out.println("\n");
		
		out.println("Enter the x1:: 1");
		out.println("Enter the y1:: 1");
		out.println("Enter the x2:: 0");
		out.println("Enter the y2:: 0");
		test.setCoordinates(1, 1, 0, 0);
		test.calcDistance();
		test.print();
		out.println("\n");
		
		Scanner keyboard = new Scanner(in);

		out.println("Enter the x1:: ");
		int x1 = keyboard.nextInt();

		out.println("Enter the y1:: ");
		int y1 = keyboard.nextInt();
		
		out.println("Enter the x2:: ");
		int x2 = keyboard.nextInt();

		out.println("Enter the y2:: ");
		int y2 = keyboard.nextInt();

		test.setCoordinates(x1, y1, x2, y2);
		test.calcDistance();
		test.print();
			
	}
}