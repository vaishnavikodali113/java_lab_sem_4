import java.util.*; // Importing required Java utilities

// Calculator class - performs basic arithmetic operations

public class Calculator {
    int num1, num2;  // Variables to store the two numbers

    // Constructor to initialize numbers
    public Calculator(int n1, int n2) {  
        num1 = n1;  // Assigning the first number
        num2 = n2;  // Assigning the second number
    }

    // Method to calculate sum of two numbers
    public int calculateSum() {
        return num1 + num2;
    }

    // Method to calculate difference of two numbers
    public int calculateDiff() {
        return num1 - num2;
    }

    // Method to calculate product of two numbers
    public int calculatePrdt() {
        return num1 * num2;
    }

    // Method to calculate division 
    public int calculateDiv() {
        if (num2 == 0) {  // Checking if denominator is zero
            System.out.println("Division by zero is not allowed.");
            return 0;  // Returning 0 to avoid error
        }
        return num1 / num2;   //Returning the final quotient values for non zero values
    }
}
