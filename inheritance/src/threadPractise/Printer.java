package threadPractise;
public class Printer implements Runnable {
    private Storage storage;
    public Printer(Storage storage) {
        this.storage = storage;
    }
    @Override
    public void run() {
        System.out.println("Printer method is running");
        for (int i = 1; i <=20; i++) {
            int value = storage.getValue();

            System.out.println(value);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}