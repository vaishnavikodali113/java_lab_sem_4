import java.util.*;

public class ArrayFunctions {
    public static void display(ArrayList<Integer> array) {  // Fix: Removed extra `void`
        // UserInput in = new UserInput();
        // int[] array = in.arrayInput();
        System.out.println("Array is: " + array);
    }

    public static void diffArray(int[] array) {
        if (array == null || array.length < 2) {
            System.out.println("Array should have at least two elements.");
            return;
        }

        int m = 0;
        int small = Integer.MAX_VALUE;

        for (int i = 0; i < array.length - 1; i++) {  // Fix: Prevents out-of-bounds error
            int difference = Math.abs(array[i + 1] - array[i]);
            System.out.println(i + " - " + (i + 1) + " | " + difference);

            if (difference < small) {  // Fix: Corrected the condition
                small = difference;
                m = i;
            }
        }

        System.out.println("Smallest difference: " + small);
        System.out.println("Index of the previous element of minimum difference: " + m);
    }

    public static void evenOdd(int[] array) {  // Fix: Added `int[] array` as a parameter
        UserInput in = new UserInput();
        // int[] array = in.arrayInput();  // Not needed anymore, as input is passed

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even.add(array[i]);
            } else {
                odd.add(array[i]);
            }
        }
        // System.out.println("Even array is: "+ even);
        // System.out.println("Odd array is: "+ odd);
        display(even);
        display(odd);
    }
}
