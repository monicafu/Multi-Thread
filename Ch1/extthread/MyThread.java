package Ch1.extthread;

public class MyThread extends Thread{
    private int i = 5;
    @Override
    public void run() {
        System.out.println("i = " + (i--) + " name = " + Thread.currentThread().getName());
    }
}
