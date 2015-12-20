package thread;

/**
 * Created by sunghee on 2015. 12. 20..
 */
public class ThreadSample9 implements Runnable {
    private String mark;

    public ThreadSample9(String mark) {
        this.mark = mark;
    }

    public static void main(String[] args) {
        Thread th_prio1 = new Thread(new ThreadSample9("-"), "Prio1");
        Thread th_prio5 = new Thread(new ThreadSample9("/"), "Prio5");
        Thread th_prio10 = new Thread(new ThreadSample9("*"), "Prio10");

        th_prio1.setPriority(Thread.MIN_PRIORITY);
        th_prio5.setPriority(Thread.NORM_PRIORITY);
        th_prio10.setPriority(Thread.MAX_PRIORITY);

        th_prio1.start();
        th_prio5.start();
        th_prio10.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.print(mark);
            for (int j = 0; j < 10000; j++) {
                ;
            }
        }
        System.out.print(Thread.currentThread().getName() + " done");
    }
}
