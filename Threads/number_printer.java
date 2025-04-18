// This class is responsible for printing numbers using a separate thread.

public class number_printer implements Runnable {
    @Override
    public void run() {
        // Logic block to print numbers from 1 to 5
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
            try {
                Thread.sleep(500); // Pause for better readability
            } catch (InterruptedException e) {
                System.out.println("Number thread interrupted.");
            }
        }
    }
}
