import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    // Calculator functions
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("Cannot divide by zero.");
        return a / b;
    }
    
    public static int square(int a) {
        return a * a;
    }

     public static int cube(int a) {
        return a * a * a;
    }

    public static double squareRoot(int a) {
        if (a < 0) throw new IllegalArgumentException("Cannot take square root of negative number.");
        return Math.sqrt(a);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n--- Simple Calculator ---");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square");
            System.out.println("6. Cube");
            System.out.println("7. Square Root");
            System.out.println("8. Exit");

            try {
                System.out.print("Choose an operation (1-8): ");
                int choice = scanner.nextInt();

                int num1 = 0, num2 = 0;

                switch (choice) {
                    case 1:
                        System.out.print("Enter two numbers: ");
                        num1 = scanner.nextInt();
                        num2 = scanner.nextInt();
                        System.out.println("Result: " + add(num1, num2));
                        break;

                     case 2:
                        System.out.print("Enter two numbers: ");
                        num1 = scanner.nextInt();
                        num2 = scanner.nextInt();
                        System.out.println("Result: " + subtract(num1, num2));
                        break;

                    case 3:
                        System.out.print("Enter two numbers: ");
                        num1 = scanner.nextInt();
                        num2 = scanner.nextInt();
                        System.out.println("Result: " + multiply(num1, num2));
                        break;

                    case 4:
                        System.out.print("Enter two numbers: ");
                        num1 = scanner.nextInt();
                        num2 = scanner.nextInt();
                        System.out.println("Result: " + divide(num1, num2));
                        break;

                    case 5:
                        System.out.print("Enter a number: ");
                        num1 = scanner.nextInt();
                        System.out.println("Square: " + square(num1));
                        break;

                    case 6:
                        System.out.print("Enter a number: ");
                        num1 = scanner.nextInt();
                        System.out.println("Cube: " + cube(num1));
                        break;

                    case 7:
                        System.out.print("Enter a number: ");
                        num1 = scanner.nextInt();
                        System.out.println("Square Root: " + squareRoot(num1));
                        break;


