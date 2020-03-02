package ElevensLab;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;
import java.awt.Color;

public class CardRunner
{
	public static void main( String args[] )
	{
		Card one = new Card("2", "SPADES", 9);
		out.println(one.getSuit());
		out.println(one.getRank());

		Card two = new Card("3", "DIAMONDS", 1);
		out.println(two);
		two.setRank("2");
		out.println(two);

		Card three = new Card("2", "DIAMONDS", 1);
		out.print(three.match(two));
		
	}
}