package thread;

/**
 * Created by sunghee on 2015. 12. 20..
 */
public class ThreadSample3 implements Runnable {

    public static void main(String[] args) {
        Runnable r = new ThreadSample3();
        Thread t = new Thread(r);
        t.start();
    }
    @Override
    public void run() {
        System.out.println("New flow, new thread is running");
    }
}
