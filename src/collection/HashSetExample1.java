package collection;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Created by sungheelee on 2015. 12. 19..
 */
public class HashSetExample1 {

    private int count = 0;
    private Random random = new Random();
    private HashSet<Integer> set = new HashSet<Integer>();

    public static void main(String[] args) {
        HashSetExample1 example = new HashSetExample1();
        example.init();
        example.execute();

    }

    private void execute() {
        HashSet<Integer> setObj = new HashSet<Integer>();
        for (int i = 0; i < 10; i++) {
            setObj.add(random.nextInt(5));

        }
        this.printStatus(setObj);
        set.addAll(setObj);
        this.printStatus(set);
    }

    private void init() {
        for (int i = 0; i < 10; i++) {
            set.add(random.nextInt(10));
        }
        this.printStatus(set);
    }

    private void printStatus(HashSet<Integer> hashSet) {
        if (hashSet == null || hashSet.size() == 0) {
            System.out.println("Object is null or size is zero");
            return;
        }

        count++;

        Integer[] array = hashSet.toArray(new Integer[hashSet.size()]);
        System.out.println("count : " + count + ", ");
        for (Integer item : array
             ) {
            System.out.print("[" + item + "]");
        }
        System.out.println("\n");
    }
}
