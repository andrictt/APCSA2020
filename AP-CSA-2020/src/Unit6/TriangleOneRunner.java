package Unit6;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class TriangleOneRunner
{
	public static void main ( String[] args )
	{
		TriangleOne hey = new TriangleOne("hippo");
		hey.print();
		System.out.println();
		
		hey.setWord("abcd");
		hey.print();
		System.out.println();
		
		hey.setWord("it");
		hey.print();
		System.out.println();
		
		hey.setWord("a");
		hey.print();
		System.out.println();
		
		hey.setWord("chicken");
		hey.print();
		System.out.println();
	}
}