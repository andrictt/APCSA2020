package Unit9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Unit8.RaySumLast;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class SumFirstRunner
{
	public static void main( String args[] )
	{
		List<Integer> hey = new ArrayList<>(Arrays.asList(-99,1,2,3,4,5,6,7,8,9,10,5));
		System.out.println(ListSumFirst.go(hey));
		List<Integer> heyy = new ArrayList<>(Arrays.asList(10,9,8,7,6,5,4,3,2,1,-99));
		System.out.println(ListSumFirst.go(heyy));
		List<Integer> heyyy = new ArrayList<>(Arrays.asList(10,20,30,40,50,-11818,40,30,20,10));
		System.out.println(ListSumFirst.go(heyyy));
		List<Integer> heyyyy = new ArrayList<>(Arrays.asList(32767));
		System.out.println(ListSumFirst.go(heyyyy));
		List<Integer> heyyyyy = new ArrayList<>(Arrays.asList(255,255));
		System.out.println(ListSumFirst.go(heyyyyy));
		List<Integer> heyyyyyy = new ArrayList<>(Arrays.asList(9,10,-88,100,-555,2));
		System.out.println(ListSumFirst.go(heyyyyyy));
		List<Integer> hey1 = new ArrayList<>(Arrays.asList(10,10,10,11,456));
		System.out.println(ListSumFirst.go(hey1));
		List<Integer> hey2 = new ArrayList<>(Arrays.asList(-111,1,2,3,9,11,20,1));
		System.out.println(ListSumFirst.go(hey2));
		List<Integer> hey3 = new ArrayList<>(Arrays.asList(9,8,7,6,5,4,3,2,0,-2,6));
		System.out.println(ListSumFirst.go(hey3));
		List<Integer> hey4 = new ArrayList<>(Arrays.asList(12,15,18,21,23,1000));
		System.out.println(ListSumFirst.go(hey4));
		List<Integer> hey5 = new ArrayList<>(Arrays.asList(250,19,17,15,13,11,10,9,6,3,2,1,0));
		System.out.println(ListSumFirst.go(hey5));
		List<Integer> hey6 = new ArrayList<>(Arrays.asList(9,10,-8,10000,-5000,-3000));
		System.out.println(ListSumFirst.go(hey6));
	}
}