// This class is responsible for printing messages using a separate thread.

public class MessagePrinter implements Runnable {
    @Override
    public void run() {
        // Logic block to print a predefined message 5 times
        for (int i = 0; i < 5; i++) {
            System.out.println("Message: Hello from thread!");
            try {
                Thread.sleep(600); // Pause for better readability
            } catch (InterruptedException e) {
                System.out.println("Message thread interrupted.");
            }
        }
    }
}
