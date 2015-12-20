package thread;

/**
 * Created by sunghee on 2015. 12. 20..
 */
public class ConcurrentSample2 implements Runnable {

    private int res = 0;

    public static void main(String[] args) {
        ConcurrentSample2 concurrent = new ConcurrentSample2();
        Thread th1 = new Thread(concurrent);
        Thread th2 = new Thread(concurrent);

        th1.start();
        th2.start();

        try {
            th1.join();
            th2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(concurrent.res);
    }


    @Override
    public void run() {
        sum();
    }

//    e.g. 보통 동기화 블록에서 락을 걸 때는 락을 걸기 위한 전용 객체를 따로 생성하며 메모리의 부담을 최소화하기 위해서 Object 클래스를 사용한다.
//         일단적으로 락 객체는 private 키워드로 선언해 다른 객체에 의해 변경되지 않도록 한다. 아래 구분을 참고
//    public class ThreadLock() {
//        private Object lockObj = new Object();
//        public void testLock(String name) {
//            synchronized (lockObj) {
//                //TODO
//            }
//        }
//    }

//    동기화 방법1
//    private synchronized void sum() {
//        for (int i = 0; i < 10000; i++) {
//            res++;
//        }
//    }

    private void sum() {
        synchronized (this) {
            for (int i = 0; i < 10000; i++) {
                res++;
            }
        }
    }
}
