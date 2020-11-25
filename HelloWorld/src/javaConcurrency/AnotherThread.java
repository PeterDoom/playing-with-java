package javaConcurrency;

import static javaConcurrency.ThreadColor.ANSI_BLUE;

public class AnotherThread extends Thread {
    @Override
    public void run() {
        System.out.println(ANSI_BLUE + "Hello From another thread.");
    }
}
