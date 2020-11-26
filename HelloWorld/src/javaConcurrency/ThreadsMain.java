package javaConcurrency;

import static javaConcurrency.ThreadColor.*;

public class ThreadsMain {
    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "Hello from the main thread");

        Thread anotherThread = new AnotherThread();
        anotherThread.setName("Another Thread");
        anotherThread.start();

        new Thread() {
            public void run() {
                System.out.println(ANSI_GREEN + "Hello from the anonymous class thread");
            }
        }.start();

        Thread myRunnableThread = new Thread(new MyRunnable());
        anotherThread.interrupt();
        myRunnableThread.start();
    }
}
