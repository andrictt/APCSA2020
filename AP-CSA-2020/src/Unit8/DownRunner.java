package Unit8;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class DownRunner
{
	public static void main( String args[])
	{
		int[] hey0 = {-99,1,2,3,4,5,6,7,8,9,10,12345};
		System.out.println(RayDown.go(hey0));
		int[] hey1 = {10,9,8,7,6,5,4,3,2,1,-99};
		System.out.println(RayDown.go(hey1));
		int[] hey2 = {10,20,30,40,50,-11818,40,30,20,10};
		System.out.println(RayDown.go(hey2));
		int[] hey3 = {32767};
		System.out.println(RayDown.go(hey3));
		int[] hey4 = {255,255};
		System.out.println(RayDown.go(hey4));
		int[] hey5 = {9,10,-88,100,-555,1000};
		System.out.println(RayDown.go(hey5));
		int[] hey6 = {10,10,10,11,456};
		System.out.println(RayDown.go(hey6));
		int[] hey7 = {-111,1,2,3,9,11,20,30};
		System.out.println(RayDown.go(hey7));
		int[] hey8 = {9,8,7,6,5,4,3,2,0,-2,-989};
		System.out.println(RayDown.go(hey8));
		int[] hey9= {12,15,18,21,23,1000};
		System.out.println(RayDown.go(hey9));
		int[] hey10 = {250,19,17,15,13,11,10,9,6,3,2,1,-455};
		System.out.println(RayDown.go(hey10));
		int[] hey11 = {9,10,-8,10000,-5000,1000};
		System.out.println(RayDown.go(hey11));
	}
}