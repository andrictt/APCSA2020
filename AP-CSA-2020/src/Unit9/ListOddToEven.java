package Unit9;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static boolean go( List<Integer> ray )
	{
		return false;
	}
	public static int goo(List<Integer> ray) {
		int oddIndex = 0;
		boolean hey = false;
		int evenIndex = 0;
		boolean heyy = false;
		for(int i = 0; i < ray.size(); i++) {
			if(ray.get(i) % 2 == 1) {
				oddIndex = i;
				hey = true;
				break;
			}
		}
		for(int i = ray.size() - 1; i > oddIndex; i--) {
			if(ray.get(i) % 2 == 0) {
				evenIndex = i;
				heyy = true;
				break;
			}
		}
		return hey && heyy ? evenIndex - oddIndex: -1;
	}
}