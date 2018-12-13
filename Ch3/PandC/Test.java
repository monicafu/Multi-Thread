package Ch3.PandC;

public class Test {
    public static void main(String[] args) {
        String lock = new String("");
        //one producer one consumer
        Producer producer = new Producer(lock);
        Consumer consumer = new Consumer(lock);
        ThreadP threadP = new ThreadP(producer);
        ThreadC threadC = new ThreadC(consumer);
        threadP.start();
        threadC.start();
    }
}
