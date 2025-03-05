import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deck deck = new Deck();

	while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Print Deck");
            System.out.println("2. Print a Specific Card");
            System.out.println("3. Print All Cards of a Suit");
            System.out.println("4. Print All Cards of a Rank");
            System.out.println("5. Find a Specific Card");
            System.out.println("6. Deal 5 Random Cards");
            System.out.println("7. Shuffle Deck");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");

	    int choice = scanner.nextInt();
            scanner.nextLine();

	     switch (choice) {
                case 1:
                    deck.printDeck();
                    break;

		case 2:
                    System.out.print("Enter index of card (0-51): ");
                    int index = scanner.nextInt();
                    deck.printCard(index);
                    break;

		case 3:
                    System.out.print("Enter suit: ");
                    String suit = scanner.nextLine();
                    deck.sameCard(suit);
                    break;

		case 4:
                    System.out.print("Enter rank: ");
                    String rank = scanner.nextLine();
                    deck.compareCard(rank);
                    break;

		case 5:
                    System.out.print("Enter rank: ");
                    rank = scanner.nextLine();
                    System.out.print("Enter suit: ");
                    suit = scanner.nextLine();
                    deck.findCard(rank, suit);
                    break;
			     
  		case 6:
                    deck.dealCard();
                    break;

		case 7:
                    deck.shuffleDeck();
                    break;

		case 8:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
