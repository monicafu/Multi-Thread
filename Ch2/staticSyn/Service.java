package Ch2.staticSyn;

import Ch2.synchronizedBlockLockAll.ThreadB;

public class Service {
    synchronized public static void printA() {
        try {
            System.out.println("threadName = " + Thread.currentThread().getName()
                    + " at " + System.currentTimeMillis() + " enter PrintA");
            Thread.sleep(2000);
            System.out.println("threadName = " + Thread.currentThread().getName()
                    + " at " + System.currentTimeMillis() + " exit  PrintA");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //or use this way:

    /**
     * public static void printA (){
     * synchronized (Service.class){
     * try{
     * //the same code here
     * } catch () {
     * }
     * }
     * }
     */

    synchronized public static void printB() {
        System.out.println("threadName = " + Thread.currentThread().getName()
                + " at " + System.currentTimeMillis() + " enter PrintB");
        System.out.println("threadName = " + Thread.currentThread().getName()
                + " at " + System.currentTimeMillis() + " exit  PrintB");
    }
}
