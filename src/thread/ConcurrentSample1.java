package thread;

/**
 * Created by sunghee on 2015. 12. 20..
 */
public class ConcurrentSample1 implements Runnable {
    private int res = 0;

    public static void main(String[] args) {
        ConcurrentSample1 concurrent = new ConcurrentSample1();
        Thread th1 = new Thread(concurrent);
        Thread th2 = new Thread(concurrent);

        th1.start();
        th2.start();

        try {
            th1.join();
            th2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(concurrent.res);
    }

    @Override
    public void run() {
        sum();
    }

    private void sum() {
        for (int i = 0; i < 10000; i++) {
            res++;
        }
    }
}
