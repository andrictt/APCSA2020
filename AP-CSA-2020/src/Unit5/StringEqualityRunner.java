package Unit5;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		StringEquality test = new StringEquality("hello", "goodbye");
		System.out.println(test.toString());
		
		test.setWords("one", "two");
		System.out.println(test.toString());
		
		test.setWords("three", "four");
		System.out.println(test.toString());
		
		test.setWords("TCEA", "UIL");
		System.out.println(test.toString());
		
		test.setWords("State", "Champions");
		System.out.println(test.toString());
		
		test.setWords("ABC", "ABC");
		System.out.println(test.toString());
		
		test.setWords("ABC", "CBA");
		System.out.println(test.toString());
		
		test.setWords("Same", "Same");
		System.out.println(test.toString());
		
		
	}
}