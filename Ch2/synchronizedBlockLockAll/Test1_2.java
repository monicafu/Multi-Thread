package Ch2.synchronizedBlockLockAll;

public class Test1_2 {
    public static void main(String[] args) {
        //use the same service but the different object
        //the result is asynchronized
        Service service = new Service();
        MyObject object1 = new MyObject();
        MyObject object2 = new MyObject();
        ThreadA a = new ThreadA(service,object1);
        a.setName("a");
        a.start();
        ThreadB b = new ThreadB(service,object2);
        b.setName("b");
        b.start();
    }
}
