import java.util.*; // Importing required java utilities

// Input class - takes two numbers as input from the user

public class Input {
    public int[] getInput() {  // Method to get numbers from the user
        Scanner scan = new Scanner(System.in); // Creating Scanner object

        System.out.println("Enter first number: ");
        int firstNumber = scan.nextInt();  // Taking first number as input

        System.out.println("Enter second number: ");
        int secondNumber = scan.nextInt();  // Taking second number as input

        int[] numbers = {firstNumber, secondNumber};  // Stores numbers in an array

        return numbers;  // Returns the array with numbers
    }
}
