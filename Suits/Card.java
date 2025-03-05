// Represents a playing card with a rank and suit
class Card {
    String rank;
    String suit;

    // Constructor to initialize a card with rank and suit
    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    // Returns the card as a formatted string
    public String toString() {
        return rank + " of " + suit;
    }
}
