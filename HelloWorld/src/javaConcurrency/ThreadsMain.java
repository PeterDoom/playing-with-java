package javaConcurrency;

public class ThreadsMain {
    public static void main(String[] args) {
        System.out.println("Hello from the main thread");

        Thread anotherThread = new AnotherThread();
        anotherThread.start();

        new Thread() {
            public void run() {
                System.out.println("Hello from the anonymous class thread");
            }
        }.start();
    }
}
