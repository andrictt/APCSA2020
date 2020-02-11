package Unit5;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
	   	WordsCompare test = new WordsCompare("abe", "ape");
	   	test.compare();
		System.out.println(test.toString());
		
		test.setWords("giraffe", "gorilla");
		test.compare();
		System.out.println(test.toString());
		
		test.setWords("one", "two");
		test.compare();
		System.out.println(test.toString());
		
		test.setWords("fun", "funny");
		test.compare();
		System.out.println(test.toString());
		
		test.setWords("123", "19");
		test.compare();
		System.out.println(test.toString());
		
		test.setWords("193", "1910");
		test.compare();
		System.out.println(test.toString());
		
		test.setWords("goofy", "godfather");
		test.compare();
		System.out.println(test.toString());
		
		test.setWords("funnel", "fun");
		test.compare();
		System.out.println(test.toString());
	}
}