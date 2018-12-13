package Ch3.PCStack;

public class Run3 {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        //multiple producer
        Producer producer1 = new Producer(myStack);
        Producer producer2 = new Producer(myStack);
        Producer producer3 = new Producer(myStack);
        Producer producer4 = new Producer(myStack);
        Producer producer5 = new Producer(myStack);

        //multiple consumer
        Consumer c1 = new Consumer(myStack);
        Consumer c2 = new Consumer(myStack);
        Consumer c3 = new Consumer(myStack);
        Consumer c4 = new Consumer(myStack);
        Consumer c5 = new Consumer(myStack);

        ThreadP threadP1 = new ThreadP(producer1);
        ThreadP threadP2 = new ThreadP(producer2);
        ThreadP threadP3 = new ThreadP(producer3);
        ThreadP threadP4 = new ThreadP(producer4);
        ThreadP threadP5 = new ThreadP(producer5);
        threadP1.start();
        threadP2.start();
        threadP3.start();
        threadP4.start();
        threadP5.start();

        ThreadC threadC1 = new ThreadC(c1);
        ThreadC threadC2 = new ThreadC(c2);
        ThreadC threadC3 = new ThreadC(c3);
        ThreadC threadC4 = new ThreadC(c4);
        ThreadC threadC5 = new ThreadC(c5);
        threadC1.start();
        threadC2.start();
        threadC3.start();
        threadC4.start();
        threadC5.start();

    }
}
