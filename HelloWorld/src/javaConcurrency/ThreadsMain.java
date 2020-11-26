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
                try {
                    anotherThread.join();
                    System.out.println(ANSI_RED + "Another Thread terminated, so I'm running again");
                } catch (InterruptedException e) {
                    System.out.println(ANSI_RED + "I couldn't wait after all. I was interrupted");
                }
            }
        }.start();

        Thread myRunnableThread = new Thread(new MyRunnable());
//        anotherThread.interrupt();
        myRunnableThread.start();
    }
}
