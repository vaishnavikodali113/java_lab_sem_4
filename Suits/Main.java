import java.util.*;

public class Main{
	public static void main(String args[]){
		Deck deck = new Deck();
		System.out.println("************Creating Deck*************");
		deck.createDeck();
		System.out.println("************Deck Created************");
		deck.displayDeck();

		deck.shuffleDeck();
		deck.displayDeck();

		deck.printTwoCards();
	}
}