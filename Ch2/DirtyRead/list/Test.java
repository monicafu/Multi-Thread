package Ch2.DirtyRead.list;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        MyOneList list = new MyOneList();
        MyThread1 thread1 = new MyThread1(list);
        thread1.setName("A");
        thread1.start();
        MyThread1 thread2 = new MyThread1(list);
        thread2.setName("B");
        thread2.start();
        Thread.sleep(2000);
        System.out.println("listSize = " + list.getSize());
    }
}
