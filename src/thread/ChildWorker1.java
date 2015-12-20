package thread;

/**
 * Created by sunghee on 2015. 12. 20..
 */
public class ChildWorker1 implements Runnable {

    @Override
    public void run() {
        while (true) {
            System.out.println("Working <<<<<<<<");
            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
