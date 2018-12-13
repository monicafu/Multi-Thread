package Ch3.PCStack;


public class ThreadC extends Thread{
    private Consumer consumer;

    public ThreadC(Consumer consumer) {
        super();
        this.consumer = consumer;
    }
    @Override
    public void run() {
        while (true) {
            consumer.popService();
        }
    }
}
