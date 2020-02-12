package Unit6;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class PerfectRunner
{
	public static void main( String args[] )
	{
		//add test cases
		Perfect remmington = new Perfect(496);
		System.out.println(remmington.toString());
		System.out.println();
		
		remmington.setNumber(45);
		System.out.println(remmington.toString());
		System.out.println();
		
		remmington.setNumber(6);
		System.out.println(remmington.toString());
		System.out.println();
		
		remmington.setNumber(14);
		System.out.println(remmington.toString());
		System.out.println();
		
		remmington.setNumber(8128);
		System.out.println(remmington.toString());
		System.out.println();
		
		remmington.setNumber(1245);
		System.out.println(remmington.toString());
		System.out.println();
		
		remmington.setNumber(33);
		System.out.println(remmington.toString());
		System.out.println();
		
		remmington.setNumber(28);
		System.out.println(remmington.toString());
		System.out.println();
		
		remmington.setNumber(27);
		System.out.println(remmington.toString());
		System.out.println();
		
		remmington.setNumber(33550336);
		System.out.println(remmington.toString());
		System.out.println();
		/*
		496
		45
		6
		14
		8128
		1245
		33
		28
		27
		33550336
		*/
	}
}