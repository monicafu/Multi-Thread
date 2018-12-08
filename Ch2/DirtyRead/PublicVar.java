package Ch2.DirtyRead;

public class PublicVar {
    public String username = "A";
    public String password = "AA";
    synchronized public void setValue(String username,String password) {
        try {
            System.out.println("old value: username = "+this.username +" password = "+this.password);
            this.username = username;
            Thread.sleep(5000);
            this.password = password;
            System.out.println("setValue thread name = " + Thread.currentThread().getName() + ", username = " + username + " password = " + password);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    //if no synchronized, it will get wrong value - dirty read
   synchronized public void getValue() {
        System.out.println("getValue thread name = " + Thread.currentThread().getName() + ", username = "+ username + " password = " + password);
    }
}
