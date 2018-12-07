package Ch1;

public class MyThread extends Thread {
    private int count = 5;
//    public MyThread(String name) {
//        super();
//        this.setName(name);
//    }
    @Override
    synchronized public void run() {
        super.run();
//        while (count > 0){
//            count--;
//            System.out.println("Thread " + this.currentThread().getName() + ": count = "+ count);
//        }
        count--;
        System.out.println("Thread " + this.currentThread().getName() + ": count = "+ count);

    }
}