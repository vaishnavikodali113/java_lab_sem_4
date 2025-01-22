import java.util.*;

public class Calculator {
    int num1, num2;  // Package-private access

    public Calculator(int n1, int n2) {  
        num1 = n1;  
        num2 = n2;
    }

    public int calculateSum() {
        return num1 + num2;
    }

    public int calculateDiff() {
        return num1 - num2;
    }

    public int calculatePrdt() {
        return num1 * num2;
    }

    public int calculateDiv() {
        if (num2 == 0) {
            System.out.println("Division by zero is not allowed.");
            return 0;
        }
        return num1 / num2;
    }
}
