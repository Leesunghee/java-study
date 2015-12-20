package thread;

import java.util.LinkedList;

/**
 * Created by sunghee on 2015. 12. 20..
 */
public class EnhancedThreadManager {
    public static void main(String[] args) {
        EnhancedResourceQueue queue = new EnhancedResourceQueue();
        Thread producer = new Thread(new EnhancedProducer(queue), "producer");
        Thread consumer1 = new Thread(new EnhancedConsumer(queue), "consumer1");
        Thread consumer2 = new Thread(new EnhancedConsumer(queue), "consumer2");

        producer.start();
        consumer1.start();
        consumer2.start();
    }
}

class EnhancedProducer implements Runnable {
    private EnhancedResourceQueue queue;

    public EnhancedProducer(EnhancedResourceQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10 && !Thread.interrupted(); i++) {
            queue.put(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
        }
    }
}

class EnhancedConsumer implements Runnable {
    private EnhancedResourceQueue queue;

    public EnhancedConsumer(EnhancedResourceQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (!Thread.interrupted()) {
            try {
                Integer res = (Integer) queue.pop();
                if (res != null) {
                    System.out.println(Thread.currentThread().getName() + " pop : " + res);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
        }
    }
}

class EnhancedResourceQueue {
    private LinkedList<Object> jobs = new LinkedList<Object>();

    public synchronized void clear() {
        jobs.clear();
    }

    public synchronized Object pop() throws InterruptedException {
        Object o = null;
        if (!jobs.isEmpty())
            this.wait();            //1. EnhancedConsumer Thread가 pop() 메소드 호출 시 처리할 일이 없으면 wait() 메소드를 호출
                                    //   Thread는 더 이상 일이 있는지 없는지 확인하기 위해서 pop() 메소드를 계속 호출할 필요가 없다.
        o = jobs.removeFirst();

        return o;
    }

    public synchronized void put(Object o) {
        jobs.addLast(o);
        this.notify();              //2. put() 메소드 호출 시 대기하고 있는 Thread를 깨우기 위해서 notify()를 합니다
                                    //1, 2 과정을 거치면 Thread의 불필요한 동작을 줄일 수 있다.
    }
}

