package thread;

/**
 * Created by sunghee on 2015. 12. 20..
 */
public class ThreadSample4 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyThread());
        t.start();
        System.out.println("MainThread terminated");
    }
}
