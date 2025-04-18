// This class is responsible for printing characters using a separate thread.

public class CharacterPrinter implements Runnable {
    @Override
    public void run() {
        // Logic block to print characters A to E
        for (char c = 'A'; c <= 'E'; c++) {
            System.out.println("Character: " + c);
            try {
                Thread.sleep(700); // Pause for better readability
            } catch (InterruptedException e) {
                System.out.println("Character thread interrupted.");
            }
        }
    }
}
