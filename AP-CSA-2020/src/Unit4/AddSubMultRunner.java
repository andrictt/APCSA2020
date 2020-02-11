package Unit4;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AddSubMultRunner
{
	public static void main( String args[] )
	{
		DecimalFormat df = new DecimalFormat("#.#");
		
		System.out.println( AddSubMult.check( 10, 20) );		
		System.out.println( AddSubMult.check( 20, 10) );	
		System.out.println( AddSubMult.check( 20, 20) );
		System.out.println( AddSubMult.check( 10, 10) );	
		System.out.println( AddSubMult.check( 0, 1) );	
		System.out.println( AddSubMult.check( 1, 0 ) );	
		System.out.println( AddSubMult.check( 3.1, 5.7) );	
		//without this format it print 1.4000000000000004
		System.out.println( df.format(AddSubMult.check( 5.2, 3.8 )) );	
		System.out.println( AddSubMult.check( 5342, 323 ) );						
	}
}