import java.util.*;

public class Deck{
	ArrayList<Card> deck;
	
	public Deck() {
        this.deck = new ArrayList<>();
        createDeck();
    }
	
	public void createDeck() {
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] suits = {"Clubs", "Diamonds", "Spades", "Hearts"};

        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(new Card(rank, suit));
            }
        }
    }

	public void displayDeck(){
		System.out.println("________Deck_________");
		for (Card card : deck){
			System.out.println(card);
		}
	}

	public void shuffleDeck(){
		System.out.println("Shuffling Deck");
		Collections.shuffle(deck);
	}

	public void printTwoCards(){
		if (deck.size() >= 2) {
			System.out.println("Top 2 cards: ");
			for (int i = 0; i < 2; i++){
			System.out.println(deck.get(i));
			}
		} else {
			System.out.println("Deck has less than 2 cards.");
		}
	}
}
