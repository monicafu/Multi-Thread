package Ch3.NotifyOne;

public class NotifyThread extends Thread{
    private Object lock;
    public NotifyThread(Object lock) {
        super();
        this.lock = lock;
    }
    @Override
    public void run() {
        //call notify() once, only randomly notify one, but call multiple times can notifyall
        //or just use notifyAll();
        synchronized (lock) {
//            lock.notify();
            lock.notifyAll();
        }
    }
}
