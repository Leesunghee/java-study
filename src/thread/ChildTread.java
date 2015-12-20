package thread;

/**
 * Created by sunghee on 2015. 12. 20..
 */
public class ChildTread implements Runnable {

    public static void main(String[] args) {
        Thread th = new Thread(new ChildTread());
        th.start();
        System.out.println("Main thread is done");
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("is running...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
