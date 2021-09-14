package javaConcurrency.ThreadStarvationExample;

public class ThreadStarvationExample {
    private static Object lock = new Object();

    public static void main(String[] args) {
    }

    private static class Worker implements Runnable {
        private int runCount = 1;
        private String threadColor;

        public Worker(String threadColor) {
            this.threadColor = threadColor;
        }

        @Override
        public void run() {

        }
    }
}
