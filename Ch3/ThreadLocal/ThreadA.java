package Ch3.ThreadLocal;

public class ThreadA extends Thread {
    @Override
    public void run() {
        try{
            for (int i = 0; i < 10; i++){
                Tools.t1.set("ThreadA " +(i+1));
                System.out.println("ThreadA get value = " +
                Tools.t1.get());
                Thread.sleep(2000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
