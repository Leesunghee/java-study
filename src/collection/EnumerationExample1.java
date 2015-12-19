package collection;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/**
 * Created by sungheelee on 2015. 12. 19..
 */
public class EnumerationExample1 {

    private final int LENGTH = 10;
    private Vector<Integer> vector = new Vector<Integer>();
    private Hashtable<Integer, String> table = new Hashtable<Integer, String>();

    public static void main(String[] args) {
        EnumerationExample1 example = new EnumerationExample1();
        example.init();
        example.execute();
    }

    private void init() {
        for (int i = 0; i < this.LENGTH; i++) {
            vector.addElement(i);
            table.put(i, "str" + i);
        }
    }

    private void execute() {
        Enumeration<Integer> eInt = vector.elements();
        while (eInt.hasMoreElements()) {
            System.out.print("[" + eInt.nextElement() + "] ");
        }
        System.out.print("\n");

        Enumeration<String> eStr = table.elements();
        while (eStr.hasMoreElements()) {
            System.out.print("[" + eStr.nextElement() + "] ");
        }
        System.out.print("\n");
    }
}
