package Ch2.synchronizedBlockLockAll;

public class Service {
    public void testMethod1 (MyObject object) {
        synchronized (object) {
            try {
                System.out.println("testMethod1 ----getLock Time = " +
                        System.currentTimeMillis() + "run threadName = " +
                        Thread.currentThread().getName());
                Thread.sleep(2000);
                System.out.println("testMethod1 releaseLock Time = " +
                        System.currentTimeMillis() + "run threadName = " +
                        Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
