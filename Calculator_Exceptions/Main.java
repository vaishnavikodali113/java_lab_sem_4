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


