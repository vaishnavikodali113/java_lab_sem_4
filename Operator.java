import java.util.*;

public class Operator {
    public void operation(int num1, int num2) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an operation:");
        System.out.println("1. Add\n2. Subtract\n3. Multiply\n4. Divide");

        int operator = scanner.nextInt();

        Calculator cal = new Calculator(num1, num2); // Pass numbers to Calculator

        switch (operator) {
            case 1:
                System.out.println("Sum is: " + cal.calculateSum());
                break;
            case 2:
                System.out.println("Difference is: " + cal.calculateDiff());
                break;
            case 3:
                System.out.println("Product is: " + cal.calculatePrdt());
                break;
            case 4:
                System.out.println("Quotient is: " + cal.calculateDiv());
                break;
            default:
                System.out.println("Invalid operator.");
        }
    }
}
