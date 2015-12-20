package thread;

/**
 * Created by sunghee on 2015. 12. 20..
 */
public class ThreadSample11 implements Runnable {
    public static void main(String[] args) throws InterruptedException {
        Thread th = new Thread(new ThreadSample11());
        th.start();

        Thread.sleep(50);

        th.interrupt();
    }

    @Override
    public void run() {

        while (true) {
            System.out.println("is running... " + Thread.interrupted());

            for (int i = 0; i < 10000000; i++) {
                ;
            }
        }
    }
}
