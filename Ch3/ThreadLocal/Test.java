package Ch3.ThreadLocal;

public class Test {
    public static void main(String[] args) {
        try{
            ThreadA threadA = new ThreadA();
            ThreadB threadB = new ThreadB();
            threadA.start();
            threadB.start();
            for (int i = 0; i < 10; i++){
                Tools.t1.set("Main thread: " + (i+1));
                System.out.println("Main get value = " + Tools.t1.get());
                Thread.sleep(2000);
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
