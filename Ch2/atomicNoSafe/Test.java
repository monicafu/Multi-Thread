package Ch2.atomicNoSafe;

public class Test {
    public static void main(String[] args) {
        try{
            MyService myService = new MyService();
            MyThread[] threads = new MyThread[5];
            for (int i = 0; i < threads.length; i++){
                threads[i] = new MyThread(myService);
            }
            for (int i = 0; i < threads.length; i++) {
                threads[i].start();
            }
            Thread.sleep(1000);
            System.out.println(myService.aiRef.get());
        }catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
