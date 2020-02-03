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
		Scanner keyboard = new Scanner(in);

		out.print("Enter the x1:: ");
		int x1 = keyboard.nextInt();

		out.print("Enter the y1:: ");
		int y1 = keyboard.nextInt();
		
		out.print("Enter the x2:: ");
		int x2 = keyboard.nextInt();

		out.print("Enter the y2:: ");
		int y2 = keyboard.nextInt();

		Distance test = new Distance(x1, y1, x2, y2);
		test.calcDistance();
		test.print();
			
	}
}