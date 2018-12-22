package Ch3.join;

public class MyThread extends Thread {
    @Override
    public void run() {
        try{
            int secValue = (int)(Math.random() * 10000);
            System.out.println(secValue);
            Thread.sleep(secValue);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
