package Ch4.condition;

public class ThreadA extends Thread {
    private MyService service;
    public ThreadA(MyService service){
        super();
        this.service = service;
    }
    @Override
    public void run(){
        service.await();
    }
}
