package Unit8;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public static boolean go(int[] ray)
	{
		return false;
	}
	public static int goo(int[] ray) {
		int oddIndex = 0;
		boolean hey = false;
		int evenIndex = 0;
		boolean heyy = false;
		for(int i = 0; i < ray.length; i++) {
			if(ray[i] % 2 == 1) {
				oddIndex = i;
				hey = true;
				break;
			}
		}
		for(int i = oddIndex; i < ray.length; i++) {
			if(ray[i] % 2 == 0) {
				evenIndex = i;
				heyy = true;
				break;
			}
		}
		return hey && heyy ? evenIndex - oddIndex: -1;
	}
}