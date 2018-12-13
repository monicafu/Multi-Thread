package Ch3.PCStack;

public class Run {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        //one producer
        Producer producer = new Producer(myStack);
        //multiple consumer
        Consumer c1 = new Consumer(myStack);
        Consumer c2 = new Consumer(myStack);
        Consumer c3 = new Consumer(myStack);
        Consumer c4 = new Consumer(myStack);
        Consumer c5 = new Consumer(myStack);

        ThreadP threadP = new ThreadP(producer);
        threadP.start();

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
