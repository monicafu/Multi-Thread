package Ch2.volatileVariable;

public class Run {
    public static void main(String[] args) {
        try {
            RunThread thread = new RunThread();
            thread.start();
            Thread.sleep(1000);
            thread.setRunning(false);
            System.out.println("already set running false");
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
