// Represents a deck of 52 playing cards
class Deck {
    ArrayList<Card> deck;

    // Constructor to initialize the deck
    public Deck() {
        this.deck = new ArrayList<>();
        createDeck();
    }

    // Creates a standard deck of 52 playing cards
    public void createDeck() {
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] suits = {"Clubs", "Diamonds", "Spades", "Hearts"};

        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(new Card(rank, suit));
            }
        }
    }

    // Prints all cards in the deck
    public void printDeck() {
        System.out.println("Deck of Cards:");
        for (Card card : deck) {
            System.out.println(card);
        }
    }

    // Prints a specific card at the given index
    public void printCard(int index) {
        if (index >= 0 && index < deck.size()) {
            System.out.println("Card at index " + index + ": " + deck.get(index));
        } else {
            System.out.println("Invalid index.");
        }
    }

    // Prints all cards from the given suit
    public void sameCard(String suit) {
        System.out.println("Cards from the suit: " + suit);
        for (Card card : deck) {
            if (card.suit.equalsIgnoreCase(suit)) {
                System.out.println(card);
            }
        }
    }

    // Prints all cards with the given rank
    public void compareCard(String rank) {
        System.out.println("Cards with the rank: " + rank);
        for (Card card : deck) {
            if (card.rank.equalsIgnoreCase(rank)) {
                System.out.println(card);
            }
        }
    }

    // Finds and prints a specific card if it exists in the deck
    public void findCard(String rank, String suit) {
        for (Card card : deck) {
            if (card.rank.equalsIgnoreCase(rank) && card.suit.equalsIgnoreCase(suit)) {
                System.out.println("Card found: " + card);
                return;
            }
        }
        System.out.println("Card not found.");
    }

    // Deals 5 random cards from the deck
    public void dealCard() {
        System.out.println("Dealing 5 random cards:");
        Collections.shuffle(deck);
        for (int i = 0; i < 5; i++) {
            System.out.println(deck.get(i));
        }
    }

    // Shuffles the deck randomly
    public void shuffleDeck() {
        System.out.println("Shuffling the deck...");
        Collections.shuffle(deck);
        System.out.println("Deck shuffled.");
    }
}
