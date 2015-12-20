package thread;

/**
 * Created by sunghee on 2015. 12. 20..
 */
public class ThreadSample2 extends Thread {
    public static void main(String[] args) {
        ThreadSample2 sample2 = new ThreadSample2();
        sample2.run();
    }

    public void run() {
        System.out.println("New flow, new thread is running");
    }
}
