package Ch2.synchronizedBlockLockAll;

public class Test1_1 {
    public static void main(String[] args) {
        //use the same service and the same object
        //the result is synchronized
        Service service = new Service();
        MyObject object = new MyObject();
        ThreadA a = new ThreadA(service,object);
        a.setName("a");
        a.start();
        ThreadB b = new ThreadB(service,object);
        b.setName("b");
        b.start();
    }
}
