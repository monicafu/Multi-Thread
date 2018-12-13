package Ch3.NotifyOne;

public class Test {
    public static void main(String[] args) throws InterruptedException{
        Object lock = new Object();
        ThreadA a = new ThreadA(lock);
        a.start();
        ThreadA b = new ThreadA(lock);
        b.start();
        ThreadA c = new ThreadA(lock);
        c.start();
        Thread.sleep(1000);
        NotifyThread notifyThread = new NotifyThread(lock);
        notifyThread.start();

    }
}
