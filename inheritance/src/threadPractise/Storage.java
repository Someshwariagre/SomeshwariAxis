package threadPractise;

public class Storage {
    private int value;
    public synchronized void setValue(int value) {
        this.value = value;
    }
    public synchronized int getValue() {
        return value;
    }
}






