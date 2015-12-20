package thread;

/**
 * Created by sunghee on 2015. 12. 20..
 */
public class ThreadSample6 {
    public static void main(String[] args) {
        Thread th1 = new Thread(new ChildWorker1());
        Thread th2 = new Thread(new ChildWorker2());

        th1.start();
        th2.start();

        System.out.println("main thread terminated");
    }
}
