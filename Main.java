import java.util.*;

public class Main {
    public static void main(String[] args) {
        Input in = new Input();
        int[] numbers = in.getInput();  // Corrected method call to `getInput()`
        int num1 = numbers[0];
        int num2 = numbers[1];

        Operator op = new Operator();
        op.operation(num1, num2);  // Pass numbers correctly to `operation()`
    }
}
