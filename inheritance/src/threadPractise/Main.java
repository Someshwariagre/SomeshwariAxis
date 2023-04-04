package threadPractise;

public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage();
        Counter counter = new Counter(storage);
        Printer printer = new Printer(storage);

        Thread counterThread = new Thread(counter);
        Thread printerThread = new Thread(printer);

        counterThread.start();
        printerThread.start();
    }
}