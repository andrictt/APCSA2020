package Unit7;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import java.util.Random;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;
	private Random rand = new Random();

	public RockPaperScissors()
	{
		playChoice = "R";
		int hey = rand.nextInt(3);
		if(hey == 0) {
			compChoice = "R";
		}
		if(hey == 1) {
			compChoice = "P";
		}
		if(hey == 2) {
			compChoice = "S";
		}
	}

	public RockPaperScissors(String player)
	{
		playChoice = player;
		int hey = rand.nextInt(3);
		if(hey == 0) {
			compChoice = "R";
		}
		if(hey == 1) {
			compChoice = "P";
		}
		if(hey == 2) {
			compChoice = "S";
		}
	}

	public void setPlayers(String player)
	{
		playChoice = player;
		int hey = rand.nextInt(3);
		if(hey == 0) {
			compChoice = "R";
		}
		if(hey == 1) {
			compChoice = "P";
		}
		if(hey == 2) {
			compChoice = "S";
		}
	}

	public String determineWinner()
	{
		if(playChoice.equals(compChoice)) {
			return "!Draw Game!";
		}
		else if (playChoice.equals("R") && compChoice.equals("P")) {
			return "!Computer wins <<Paper Covers Rock>>!";
		}
		else if(playChoice.equals("P") && compChoice.equals("S")) {
			return "!Computer wins <<Scissors Cuts Paper>>!";
		}
		else if(playChoice.equals("S") && compChoice.equals("R")) {
			return "!Computer wins <<Rock Breaks Scissors>>!";
		}
		
		else if (playChoice.equals("P") && compChoice.equals("R")) {
			return "!Player wins <<Paper Covers Rock>>!";
		}
		else if(playChoice.equals("S") && compChoice.equals("P")) {
			return "!Player wins <<Scissors Cuts Paper>>!";
		}
		else if(playChoice.equals("R") && compChoice.equals("S")) {
			return "!Player wins <<Rock Breaks Scissors>>!";
		}
		return "idk";
	}

	public String toString()
	{
		String output= "player had " + playChoice + "\ncomputer had " + compChoice + "\n" + determineWinner();
		return output;
	}
}