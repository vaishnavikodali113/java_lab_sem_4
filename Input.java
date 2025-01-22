import java.util.*;

public class Input {
    public int[] getInput() {  
        Scanner scan = new Scanner(System.in);  

        System.out.println("Enter first number: ");
        int firstNumber = scan.nextInt();

        System.out.println("Enter second number: ");
        int secondNumber = scan.nextInt();

        int[] numbers = {firstNumber, secondNumber};

        return numbers;
    }
}
