package Unit13;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	public static int[] makeLucky7Array( int size)
	{
		int[] hey = new int[size];
		for (int i = 0; i < hey.length; i++) {
			Random rand = new Random();
			hey[i] = rand.nextInt(10);
		}
		
		return hey;
	}
	public static void shiftEm(int[] array)
	{
		int counter = 0;
		for (int i = 0; i < array.length; i++) {
			if(array[i] == 7) {
				int temp = array[i];
				array[i] = array[counter];
				array[counter] = temp;
				counter++;
			}
		}
	}
}