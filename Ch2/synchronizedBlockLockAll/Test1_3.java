package Ch2.synchronizedBlockLockAll;

public class Test1_3 {
    public static void main(String[] args) {
        Service service = new Service();
        MyObject object = new MyObject();
        ThreadA a = new ThreadA(service,object);
        a.setName("a");
        a.start();
        ThreadB b = new ThreadB(object);
        b.setName("b");
        b.start();
    }
}
