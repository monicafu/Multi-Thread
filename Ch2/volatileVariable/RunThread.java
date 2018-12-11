package Ch2.volatileVariable;

public class RunThread extends Thread{
    volatile private boolean isRunning = true;//volatile is used to set variable
    public boolean isRunning() {
        return isRunning;
    }
    public void setRunning(boolean isRunning) {
        this.isRunning = isRunning;
    }
    @Override
    public void run() {
        System.out.println("enter run.");
        while (isRunning) {
        }
        System.out.println("thread is stop!");
    }
}
