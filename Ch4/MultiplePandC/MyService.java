package Ch4.MultiplePandC;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    private boolean hasValue = false;

    public void setValue(){
        try{
            lock.lock();
            while (hasValue == true){
                System.out.println("continue produce multiple *");
                condition.await();
            }
            System.out.println("*");
            hasValue = true;
            condition.signalAll();//if use signal program will terminate
        }catch(InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    public void getValue() {
        try{
            lock.lock();
            while (hasValue == false) {
                System.out.println("continue consume multiple @");
                condition.await();
            }
            System.out.println("@");
            hasValue = false;
            condition.signalAll();
        }catch(InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
