package CelebrityLab;

import java.util.ArrayList;

public class SportsCelebrity extends Celebrity{

	private ArrayList<String> clueList;
	public SportsCelebrity(String answer, String clue) {
		super(answer, clue);
	}
	/**
	 * Processes the series of clues for the LiteratureCelebrity by adding all the values to an ArrayList<String> by
	 * splitting the original clue to an array of String.
	 * The original value is not impacted, thus preserving data and inheritance integrity.
	 */
	private void processClues()
	{
		String [] clues = super.getClue().split(",");
		clueList = new ArrayList<String>();
		for (String currentClue : clues)
		{
			clueList.add(currentClue);
		}
	}
	
	/**
	 * Overridden version of the getClue() method that cycles through each of the individual clues in the series.
	 * It recreates the clueList if the user has finished the series of clues.
	 */
	@Override
	public String getClue()
	{
		if (clueList.size() == 0)
		{
			processClues();
		}
		String currentClue = clueList.remove(0);
		
		return currentClue;
	}
	
	
	@Override
	public String toString()
	{
		String dsc = "This is the sports celebrity: " + getAnswer() + "\nThe clues are:\n";
		
		for (String word : super.getClue().split(","))
		{
			dsc += word + "\n";
		}
		
		return dsc;
	}

}
