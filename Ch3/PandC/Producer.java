package Ch3.PandC;

public class Producer {
    private String lock;
    public Producer(String lock) {
        super();
        this.lock = lock;
    }
    public void setValue() {
        try {
            synchronized (lock) {
                if (!ValueObject.value.equals("")) {
                    lock.wait();
                }
                String value = System.currentTimeMillis() + "_"
                        +System.nanoTime();
                System.out.println("set value = " + value);
                ValueObject.value = value;
                lock.notify();
            }
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
