package Unit7;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		char response;
		String again;
		
		//add in a do while loop after you get the basics up and running
		do {
			
			String player = "";
		
			out.print("Rock-Paper-Scissors - pick your weapon [R,P,S] :: ");
			
			//read in the player value
			player = keyboard.next().toUpperCase();
			
			RockPaperScissors game = new RockPaperScissors(player);
			System.out.println(game);
			System.out.println();
			System.out.print("Want to play again? ");
			
			again = keyboard.next();
		}while(again.toLowerCase().equals("y"));
	}
}



