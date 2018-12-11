package Ch2.atomicNoSafe;

import java.util.concurrent.atomic.AtomicLong;

public class MyService {
    public static AtomicLong aiRef = new AtomicLong();
    //add synchronized to this addNum,because the atomic is not safe
    synchronized public void addNum() {
        System.out.println(Thread.currentThread().getName() + " add 100 will be = "
         + aiRef.addAndGet(100));
        aiRef.addAndGet(1);
    }
}
