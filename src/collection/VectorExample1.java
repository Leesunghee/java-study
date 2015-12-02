package collection;

import java.util.Vector;

/**
 * Created by sunghee on 2015. 12. 2..
 */
public class VectorExample1 {

    private int count = 0;

    private Vector<String> vector = new Vector<String>(10, 5);

    public static void main(String[] args) {

        VectorExample1 example = new VectorExample1();
        example.execute();
    }

    private void execute() {
        this.printStatus();
        for (int i = 0; i < 9; i++) {
            vector.addElement(String.valueOf(i));

        }

        this.printStatus();
        for (int i = 0; i < 4; i++) {
            vector.add(String.valueOf(i));

        }

        this.printStatus();
        vector.trimToSize();

        this.printStatus();
        vector.setSize(20);

        this.printStatus();

        System.out.println(vector.toString());
    }

    private void printStatus() {

        count++;
        System.out.println("[" + count + "] Capacity : " + vector.capacity() + ", Element size : " + vector.size());
    }
}
