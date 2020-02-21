package Unit8;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class OddToEvenRunner
{
	public static void main( String args[] )
	{
		int[] hey0 = {7,1,5,3,11,5,6,7,8,9,10,12345,11};
		System.out.println(RayOddToEven.goo(hey0));
		int[] hey1 = {11,9,8,7,6,5,4,3,2,1,-99,7};
		System.out.println(RayOddToEven.goo(hey1));
		int[] hey2 = {10,20,30,40,5,41,31,20,11,7};
		System.out.println(RayOddToEven.goo(hey2));
		int[] hey3= {32767,70,4,5,6,7};
		System.out.println(RayOddToEven.goo(hey3));
		int[] hey4 = {2,7,11,21,5,7};
		System.out.println(RayOddToEven.goo(hey4));
		int[] hey5 = {7,255,11,255,100,3,2};
		System.out.println(RayOddToEven.goo(hey5));
		int[] hey6 = {9,11,11,11,7,1000,3};
		System.out.println(RayOddToEven.goo(hey6));
		int[] hey7 = {7,7,7,11,2,7,7,11,11,2};
		System.out.println(RayOddToEven.goo(hey7));
		int[] hey8 = {2,4,6,8,8};
		System.out.println(RayOddToEven.goo(hey8));
	}
}