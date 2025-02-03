import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {
        ArrayFunctions functions = new ArrayFunctions();
        UserInput ui = new UserInput();
        int[] inputArray = ui.arrayInput();  // Fix: Corrected variable name

        // Convert array to ArrayList manually
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int num : inputArray) {
            arrayList.add(num);
        }

        functions.display(arrayList);  // Now correctly passing an ArrayList
        functions.evenOdd(inputArray);  // Passing inputArray to evenOdd
        functions.diffArray(inputArray);  // Passing inputArray to diffArray
    }
}
