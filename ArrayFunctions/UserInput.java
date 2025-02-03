import java.util.*;

public class UserInput {
    public int[] arrayInput() {
        int array[] = new int[5];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 5 numbers: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        return array;
    }
}
