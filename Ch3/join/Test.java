package Ch3.join;

public class Test {
    public static void main(String[] args) {
        try {
           MyThread threadTest = new MyThread();
           threadTest.start();
           threadTest.join();
           System.out.println("when threadTest is done, I will execute.");
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
