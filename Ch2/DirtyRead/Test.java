package Ch2.DirtyRead;

public class Test {
    public static void main(String[] args) {
        try {
            PublicVar publicVarRef = new PublicVar();
            ThreadA thread = new ThreadA(publicVarRef);
            thread.start();
            Thread.sleep(2000);
            publicVarRef.getValue();
        }catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
