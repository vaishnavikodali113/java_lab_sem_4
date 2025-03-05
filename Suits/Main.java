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

		




		
