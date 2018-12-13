package Ch3.PandC;

public class ThreadC extends Thread{
    private Consumer consumer;

    public ThreadC(Consumer consumer) {
        super();
        this.consumer = consumer;
    }
    @Override
    public void run() {
        while (true) {
            consumer.getValue();
        }
    }
}
