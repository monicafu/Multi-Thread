package Ch2.synchronizedBlockLockAll;

public class MyObject {
    synchronized public void speedPrintString() {
        synchronized (this) {
            System.out.println("speedPrintString ----getLock Time = " +
                    System.currentTimeMillis() + "run threadName = " +
                    Thread.currentThread().getName());
            System.out.println("----------------------------------");
            System.out.println("speedPrintString releaseLock Time = " +
                    System.currentTimeMillis() + "run threadName = " +
                    Thread.currentThread().getName());
        }
    }
}
