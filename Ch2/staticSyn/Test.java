package Ch2.staticSyn;

public class Test {
    public static void main(String[] args) {
        //static syn like syn class
        //even though use different service/object, but run in synchronized
        Service service1 = new Service();
        Service service2 = new Service();
        ThreadA a = new ThreadA(service1);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(service2);
        b.setName("B");
        b.start();
    }
}
