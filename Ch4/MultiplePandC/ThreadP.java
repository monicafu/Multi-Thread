package Ch4.MultiplePandC;

public class ThreadP extends Thread {
    private MyService myService;

    public ThreadP(MyService service){
        super();
        this.myService = service;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            myService.setValue();
        }
    }
}
