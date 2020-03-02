package ElevensLab;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Card
{
	
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

	//instance variables
			//String suit
			//int face
	private String rank;
	private String suit;
	private int pointValue;
	
  	//constructors
	public Card() {
		rank = "";
		suit = "";
		pointValue = 0;
	}
	public Card(String rank, String suit, int pointValue) {

		this.rank = rank;
		this.suit = suit;
		this.pointValue = pointValue;
	}
	public Card(String suit, int pointValue) {
		this.suit = suit;
		this.pointValue = pointValue;
	}
	
	// modifiers
		//set methods
	public void setRank(String rank) {
		this.rank = rank;
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}
	public void setPointValue(int pointValue) {
		this.pointValue = pointValue;
	}


  	//accessors
		//get methods
	public String getRank() {
		return rank;
	}
	public String getSuit() {
		return suit;
	}
	public int getPointValue() {
		return pointValue;
	}

  	//toString
	public String toString() {
		String output = "";
		output = FACES[getPointValue()] + " of " + getSuit();
		return output;
	}
	
	public boolean match(Card card) {
		if(card.getSuit().equals(this.getSuit()) && card.getRank().equals(this.getRank()) && card.getPointValue() == this.getPointValue()) {
			return true;
		}
		else {
			return false;
		}
	}
 }