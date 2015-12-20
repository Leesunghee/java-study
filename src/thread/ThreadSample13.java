package thread;

/**
 * Created by sunghee on 2015. 12. 20..
 */
public class ThreadSample13 implements Runnable {
    public static void main(String[] args) throws InterruptedException {

        Thread th = new Thread(new ThreadSample13());
        th.start();

        Thread.sleep(500);
        th.interrupt();
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("is running... ");

            try {
                // sleep(), wait(), join() 같은 메소드는 Thread가 다시 깨어날 때까지 interrupt상태를 확인할 수 없다
                // 따라서 interrupt가 발생했을 때 깨어날 수 있도록 InterruptedException을 발생시킨다
                // 그러므로 Thread.sleep(), wait(), join() 메소드를 사용할 때 InterruptedException에 대한 처리를 해줘야 함.
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
        }
        System.out.println("terminated... ");
    }
}
