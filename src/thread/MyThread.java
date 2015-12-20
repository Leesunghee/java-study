package thread;

/**
 * Created by sunghee on 2015. 12. 20..
 */
public class MyThread implements Runnable {

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
