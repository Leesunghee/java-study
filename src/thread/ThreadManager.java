package thread;

import java.util.LinkedList;

/**
 * Created by sunghee on 2015. 12. 20..
 */
public class ThreadManager {
    public static void main(String[] args) {
        ResourceQueue queue = new ResourceQueue();
        Thread producer = new Thread(new Producer(queue), "producer");
        Thread consumer1 = new Thread(new Consumer(queue), "consumer1");
        Thread consumer2 = new Thread(new Consumer(queue), "consumer2");

        producer.start();
        consumer1.start();
        consumer2.start();
    }
}

class Producer implements Runnable {
    private ResourceQueue queue;

    public Producer(ResourceQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
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

class Consumer implements Runnable {
    private ResourceQueue queue;

    public Consumer(ResourceQueue queue) {
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

class ResourceQueue {
    private LinkedList<Object> jobs = new LinkedList<Object>();

    public synchronized void clear() {
        jobs.clear();
    }

    public synchronized Object pop() throws InterruptedException {
        Object o = null;
        if (!jobs.isEmpty()) {
            o = jobs.removeFirst();
        }

        return o;
    }

    public synchronized void put(Object o) {
        jobs.addLast(o);
    }
}
