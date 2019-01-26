package Ch4.OnePandC;


public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService myService = new MyService();
        ThreadP producer = new ThreadP(myService);
        producer.start();
        ThreadC consumer = new ThreadC(myService);
        consumer.start();
    }
}
