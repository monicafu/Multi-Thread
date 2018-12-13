package Ch3.PCStack;

import java.util.ArrayList;
import java.util.List;

public class MyStack {
    private List list = new ArrayList();
    synchronized public void push() {
        try {
            //if change to while!
            while (list.size() == 1) {
                this.wait();
            }
            list.add("anyString = " +Math.random());
            this.notifyAll();//change to notifyall
            System.out.println("push = " + list.size());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    synchronized public String pop() {
        String returnValue = "";
        try {
            //if change to while!
            while (list.size() == 0) {
                System.out.println("in pop " + Thread.currentThread().getName() + " thread is waiting");
                this.wait();
            }
            returnValue = "" + list.get(0);
            list.remove(0);
            this.notifyAll();//change to notifyall
            System.out.println("pop = " + list.size());
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        return returnValue;
    }
}
