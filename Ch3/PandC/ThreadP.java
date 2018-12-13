package Ch3.PandC;

import Ch3.NotifyOne.ThreadA;

public class ThreadP extends Thread{
    private Producer producer;

    public ThreadP(Producer producer) {
        super();
        this.producer = producer;
    }
    @Override
    public void run() {
        while (true) {
            producer.setValue();
        }
    }
}
