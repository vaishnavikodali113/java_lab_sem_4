import java.util.*; // Importing necessary java utilities

// Main class - entry point of the program

public class Main {
    public static void main(String[] args) {
        Input in = new Input();  // Creating Input object to take numbers
        int[] numbers = in.getInput();  // Getting numbers from user

        int num1 = numbers[0];  // Extracting first number
        int num2 = numbers[1];  // Extracting second number

        Operator op = new Operator();  // Creating Operator object
        op.operation(num1, num2);  // Passing numbers to Operator to perform calculation
    }
}
