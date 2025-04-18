public class Main {
    public static void main(String[] args) {
        // Creating instances of the Runnable implementations
        number_printer numberThread = new number_printer();
        CharacterPrinter charThread = new CharacterPrinter();
        MessagePrinter messageThread = new MessagePrinter();

        // Creating Thread objects and passing Runnable tasks
        Thread t1 = new Thread(numberThread);
        Thread t2 = new Thread(charThread);
        Thread t3 = new Thread(messageThread);

        // Starting all threads
        t1.start();
        t2.start();
        t3.start();
    }
}
