package Unit7;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		letter = 'C';
		amount = 1;
	}

	public TriangleFive(char c, int amt)
	{
		letter = c;
		amount = amt;
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{
		for(int h = 0; h < amount; h++) {
			for(int i = 0; i < amount - h; i++) {
				for (int j = i; j < amount; j++) {
					char heyy = (char) (letter + i);
					if (heyy > 90) {
						heyy = (char)(heyy - 26);
					}
					System.out.print(heyy);
				}
				System.out.print(" ");
			}
			System.out.println();
		}
		String output="";
		return output;
	}
}