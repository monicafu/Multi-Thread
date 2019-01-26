package Ch4.MultiplePandC;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        ThreadP[] producers = new ThreadP[10];
        ThreadC[] consumers = new ThreadC[10];
        for (int i = 0; i < 10; i++){
            producers[i] = new ThreadP(service);
            consumers[i] = new ThreadC(service);
            producers[i].start();
            consumers[i].start();
        }
    }
}
