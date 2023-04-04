package threadPractise;

public class Counter implements Runnable {
    private Storage storage;
    public Counter(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        System.out.println("counter method is running");
        for (int i = 1; i <=20; i++) {
            storage.setValue(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
