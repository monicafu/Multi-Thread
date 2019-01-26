package Ch4.MultiplePandC;

public class ThreadC extends Thread {
    private MyService myService;

    public ThreadC(MyService service){
        super();
        this.myService = service;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            myService.getValue();
        }
    }
}
