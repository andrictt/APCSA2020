package Unit10;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class ToyRunner
{
	public static void main(String[] args)
	{
		Toy x = new Toy("store");
		x.setCount(1);
		System.out.println(x);
		
		Toy x1 = new Toy("gi joe");
		x1.setCount(5);
		System.out.println(x1);
	}
}