package Unit8;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class SumLastRunner
{
	public static void main( String args[] )
	{
		int[] hey = {-99,1,2,3,4,5,6,7,8,9,10,5};
		System.out.println(RaySumLast.go(hey));
		int[] heyy = {10,9,8,7,6,5,4,3,2,1,-99};
		System.out.println(RaySumLast.go(heyy));
		int[] heyyy = {10,20,30,40,50,-11818,40,30,20,10};
		System.out.println(RaySumLast.go(heyyy));
		int[] heyyyy = {32767};
		System.out.println(RaySumLast.go(heyyyy));
		int[] heyyyyy = {255,255};
		System.out.println(RaySumLast.go(heyyyyy));
		int[] heyyyyyy = {9,10,-88,100,-555,2};
		System.out.println(RaySumLast.go(heyyyyyy));
		int[] hey1 = {10,10,10,11,456};
		System.out.println(RaySumLast.go(hey1));
		int[] hey2 = {-111,1,2,3,9,11,20,1};
		System.out.println(RaySumLast.go(hey2));
		int[] hey3 = {9,8,7,6,5,4,3,2,0,-2,6};
		System.out.println(RaySumLast.go(hey3));
		int[] hey4 = {12,15,18,21,23,1000};
		System.out.println(RaySumLast.go(hey4));
		int[] hey5 = {250,19,17,15,13,11,10,9,6,3,2,1,0};
		System.out.println(RaySumLast.go(hey5));
		int[] hey6 = {9,10,-8,10000,-5000,-3000};
		System.out.println(RaySumLast.go(hey6));
	};
};