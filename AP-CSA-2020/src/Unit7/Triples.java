package Unit7;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		number = num;
	}

	public void setNum(int num)
	{
		number = num;
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = 0;
		for(int i = 1; i < number; i++) {
			if(a % i == 0 && b % i == 0 && c % i == 0 ) {
				max = i;
			}
		}
		return max;
	}
	
	private void pythagTriples(int num) {
		for(int i = 1; i < number; i++) {
			for(int j = i; j < number; j++) {
				for(int k = 1; k < number; k++) {
					if(i*i + j*j == k*k) {
						if(greatestCommonFactor(i, j, k) == 1) {
							System.out.println(i + " " + j + " " + k);
						}
					}
				}
			}
		}
	}
	public String toString()
	{
		pythagTriples(number);
		return null;
	}
}