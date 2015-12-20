package thread;

import java.util.ArrayList;

/**
 * Created by sunghee on 2015. 12. 20..
 */
public class ConcurrentSample6 implements Runnable {

    private ArrayList<Integer> list = new ArrayList<Integer>();

    public static void main(String[] args) {
        ConcurrentSample6 concurrent = new ConcurrentSample6();

        Thread th1 = new Thread(concurrent);
        Thread th2 = new Thread(concurrent);
        Thread th3 = new Thread(concurrent);

        th1.start();
        th2.start();
        th3.start();
    }

    @Override
    public void run() {
        long sTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            addList();
        }
        long eTime = System.currentTimeMillis();

        System.out.println(Thread.currentThread().getName() + " : " + (eTime - sTime) + "ms");
    }

    private synchronized void addList() {
        int val = (int) (Math.random() * 10); //addList() 전체가 동기화 구문으로 지정되어 난수를 구하는 구분까지 불필요하게 동기화 구문에 포함

        if (!list.contains(val)) {
            list.add(val);
        }
    }
}
