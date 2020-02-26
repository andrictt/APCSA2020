package Unit9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Unit8.RayDown;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class DownRunner
{
	public static void main( String args[] )
	{
		List<Integer> hey0 = new ArrayList<>(Arrays.asList(-99,1,2,3,4,5,6,7,8,9,10,12345));
		System.out.println(ListDown.go(hey0));
		List<Integer> hey1 = new ArrayList<>(Arrays.asList(10,9,8,7,6,5,4,3,2,1,-99));
		System.out.println(ListDown.go(hey1));
		List<Integer> hey2 = new ArrayList<>(Arrays.asList(10,20,30,40,50,-11818,40,30,20,10));
		System.out.println(ListDown.go(hey2));
		List<Integer> hey3 = new ArrayList<>(Arrays.asList(32767));
		System.out.println(ListDown.go(hey3));
		List<Integer> hey4 = new ArrayList<>(Arrays.asList(255,255));
		System.out.println(ListDown.go(hey4));
		List<Integer> hey5 = new ArrayList<>(Arrays.asList(9,10,-88,100,-555,1000));
		System.out.println(ListDown.go(hey5));
		List<Integer> hey6 = new ArrayList<>(Arrays.asList(10,10,10,11,456));
		System.out.println(ListDown.go(hey6));
		List<Integer> hey7 = new ArrayList<>(Arrays.asList(-111,1,2,3,9,11,20,30));
		System.out.println(ListDown.go(hey7));
		List<Integer> hey8 = new ArrayList<>(Arrays.asList(9,8,7,6,5,4,3,2,0,-2,-989));
		System.out.println(ListDown.go(hey8));
		List<Integer> hey9= new ArrayList<>(Arrays.asList(12,15,18,21,23,1000));
		System.out.println(ListDown.go(hey9));
		List<Integer> hey10 = new ArrayList<>(Arrays.asList(250,19,17,15,13,11,10,9,6,3,2,1,-455));
		System.out.println(ListDown.go(hey10));
		List<Integer> hey11 = new ArrayList<>(Arrays.asList(9,10,-8,10000,-5000,1000));
		System.out.println(ListDown.go(hey11));
	}
}