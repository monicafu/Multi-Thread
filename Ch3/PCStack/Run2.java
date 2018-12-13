package Ch3.PCStack;

public class Run2 {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        //multiple producer
        Producer producer1 = new Producer(myStack);
        Producer producer2 = new Producer(myStack);
        Producer producer3 = new Producer(myStack);
        Producer producer4 = new Producer(myStack);
        Producer producer5 = new Producer(myStack);

        //one consumer
        Consumer c1 = new Consumer(myStack);

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
        ThreadC threadC = new ThreadC(c1);
        threadC.start();
    }


}
