package thread;

/**
 * Created by sunghee on 2015. 12. 20..
 */
public class ThreadSample10 implements Runnable {
    public static void main(String[] args) {
        Thread th = new Thread(new ThreadSample10());
        th.setPriority(3);
        th.start();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        th.setPriority(10);
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("Priority : " + Thread.currentThread().getPriority());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
