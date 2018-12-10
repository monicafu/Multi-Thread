package Ch2.synchronizedBlockLockAll;

public class ThreadB extends Thread{
    private Service service;
    private MyObject object;

    public ThreadB(MyObject object) {
        super();
        this.object = object;
    }

    public ThreadB(Service service, MyObject object) {
        super();
        this.service = service;
        this.object = object;
    }
    @Override
    public void run() {
        super.run();
//        service.testMethod1(object);//test1_1 and test1_2
        object.speedPrintString();
    }
}
