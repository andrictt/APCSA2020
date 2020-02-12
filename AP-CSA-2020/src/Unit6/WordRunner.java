package Unit6;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class WordRunner
{
	public static void main ( String[] args )
	{
		Word hey = new Word("Hello");
		System.out.println(hey.toString());
		System.out.println();
		
		hey.setString("World");
		System.out.println(hey.toString());
		System.out.println();
		
		hey.setString("JukeBox");
		System.out.println(hey.toString());
		System.out.println();
		
		hey.setString("TCEA");
		System.out.println(hey.toString());
		System.out.println();
		
		hey.setString("UIL");
		System.out.println(hey.toString());
		System.out.println();
	}
}