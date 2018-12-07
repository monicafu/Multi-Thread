package Ch1.controller;

public class BLogin extends Thread{
    @Override
    public void run() {
        LoginServlet.doPost("b","bbb");
    }
}
