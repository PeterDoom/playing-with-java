package javaConcurrency;

public class AnotherThread extends Thread {
    @Override
    public void run() {
        System.out.println("Hello From another thread.");
    }
}
