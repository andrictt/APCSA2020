package ElevensLab;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Deck {
//make a Deck class

	public static final int NUMCARDS = 52;
	public static String[] SUITS = "CLUBS HEARTS DIAMONDS SPADES".split(" ");

	private List<Card> cards;
	private int top;
	private int size;

	public Deck() {
		// make a Deck constructor
		// refer cards to new ArrayList
		// set top to the top of the deck 51
		cards = new ArrayList<Card>();
		for (int i = 0; i < 4; i++) {
			for (int j = 1; j <= 13; j++) {
				cards.add(new Card(SUITS[i], j));
			}
			size = cards.size();
			top = cards.size() - 1;
		}
		// loop through all suits
		// loop through all faces 1 to 13
		// add a new TwentyOneCard to the deck
	}

	public Deck(String[] ranks, String suits[], int[] pointValues) {
		// make a Deck constructor
		// refer cards to new ArrayList
		// set top to the top of the deck 51
		cards = new ArrayList<Card>();
		for (int i = 0; i < suits.length; i++) {
			for (int j = 0; j < ranks.length; j++) {
				cards.add(new Card(ranks[j], suits[i], pointValues[j]));
			}
			size = cards.size();
			top = cards.size() - 1;
		}
		// loop through all suits
		// loop through all faces 1 to 13
		// add a new TwentyOneCard to the deck
	}

	// make a dealCard() method that returns the top card
	public Card dealCard() {
		Card temp;
		if(!isEmpty()) {
			temp = cards.get(top);
		}
		else {
			return new Card();
		}
		if (top < 0) {
			top = 51;
		}
		top--;
		size--;
		return temp;
	}

	// write a shuffle() method
	// use Colletions.shuffle
	// reset the top card
	public void shuffle() {
		Collections.shuffle(cards);
		top = cards.size() - 1;
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	public String toString() {
		String hey = "size = " + cards.size() + "\nUndealt cards: \n";

		for (int i = cards.size() - 1; i >= 0; i--) {
			hey = hey + cards.get(i);
			if (i != 0) {
				hey = hey + ", ";
			}
			if ((cards.size() - i) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				hey = hey + "\n";
			}
		}

		hey = hey + "\nDealt cards: \n";
		for (int i = cards.size() - 1; i >= size; i--) {
			hey = hey + cards.get(i);
			if (i != size) {
				hey = hey + ", ";
			}
			if ((i - cards.size()) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				hey = hey + "\n";
			}
		}

		hey = hey + "\n";
		return hey;
	}

	public int size() {
		// TODO Auto-generated method stub
		return size;
	}
}