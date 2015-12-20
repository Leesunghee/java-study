package thread;

/**
 * Created by sunghee on 2015. 12. 20..
 */
public class ThreadGroupSample3 implements Runnable {
    public static void main(String[] args) {
        new Thread(new ThreadGroupSample3(), "sampleThread").start();

        ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();

        Thread[] threadArray = new Thread[threadGroup.activeCount()];

        threadGroup.enumerate(threadArray);

        for (Thread th :
                threadArray) {
            System.out.println(th.getName());
        }

    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }

        }
    }
}
