package thread;

/**
 * Created by sunghee on 2015. 12. 20..
 */
public class ThreadSample5 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyThread());
        t.run();
        System.out.println("MainThread terminated");
    }
}
