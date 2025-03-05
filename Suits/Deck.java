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

	public void printDeck() {
        System.out.println("Deck of Cards:");
        for (Card card : deck) {
            System.out.println(card);
        }
    }

	public void printCard(int index) {
        if (index >= 0 && index < deck.size()) {
            System.out.println("Card at index " + index + ": " + deck.get(index));
        } else {
            System.out.println("Invalid index.");
        }
    }
	public void compareCard(String rank) {
        System.out.println("Cards with the rank: " + rank);
        for (Card card : deck) {
            if (card.rank.equalsIgnoreCase(rank)) {
                System.out.println(card);
            }
        }
    }
	public void findCard(String rank, String suit) {
        for (Card card : deck) {
            if (card.rank.equalsIgnoreCase(rank) && card.suit.equalsIgnoreCase(suit)) {
                System.out.println("Card found: " + card);
                return;
            }
        }
        System.out.println("Card not found.");
    }

}
