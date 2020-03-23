package Unit13;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifterRunner
{
	public static void main( String args[] ) throws IOException
	{
		int[] hey0 = NumberShifter.makeLucky7Array(40);
		System.out.println(Arrays.toString(hey0));
		NumberShifter.shiftEm(hey0);
		System.out.println(Arrays.toString(hey0));
		System.out.println();
		
		int[] hey1 = NumberShifter.makeLucky7Array(40);
		System.out.println(Arrays.toString(hey1));
		NumberShifter.shiftEm(hey1);
		System.out.println(Arrays.toString(hey1));
		System.out.println();
		
		int[] hey2 = NumberShifter.makeLucky7Array(40);
		System.out.println(Arrays.toString(hey2));
		NumberShifter.shiftEm(hey2);
		System.out.println(Arrays.toString(hey2));
		System.out.println();
	}
}



