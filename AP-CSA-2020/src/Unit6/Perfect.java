package Unit6;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;

	//add constructors
   public Perfect() {
	   number = 0;
   }
   
   public Perfect(int x) {
	   number = x;
   }
   
	//add a set method
   public void setNumber(int x) {
	   number = x;
   }
   
	public boolean isPerfect()
	{
		int count = 0;
		for(int i = 1; i < number - 1; i++) {
			if(number % i == 0) {
				count += i;
			}
		}
		return count == number;
	}

	//add a toString	
	public String toString()
 	{
 		return isPerfect() ? number + " is perfect": number + " is not perfect";
	}
}