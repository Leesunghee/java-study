package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Vector;

/**
 * Created by sunghee on 2015. 12. 2..
 */
public class ListExample1 {

    private final int MAX_INT = 9;
    private Random random = new Random();
    private ArrayList<Integer> arrayList = new ArrayList<Integer>();
    private Vector<Integer> vector = new Vector<Integer>();

    public static void main(String[] args) {
        ListExample1 example = new ListExample1();
        example.testArrayList();
        example.testVector();
    }

    private void testVector() {

        for (int i = 0; i < MAX_INT; i++) {
            vector.add(random.nextInt(MAX_INT));
        }
        this.printMember(vector);
        vector.remove(2);
        this.printMember(vector);
        vector.add(8);
        this.printMember(vector);
        vector.clear();
        this.printMember(vector);


    }

    private void testArrayList() {

        for (int i = 0; i < MAX_INT; i++) {
            arrayList.add(random.nextInt(MAX_INT));
        }

        this.printMember(arrayList);
        arrayList.remove(2);
        this.printMember(arrayList);
        arrayList.add(8);
        this.printMember(arrayList);
        arrayList.clear();
        this.printMember(arrayList);

    }

    private void printMember(List<Integer> list) {
        int totalSize = list.size();

        if (list instanceof ArrayList) {
            System.out.println("ArrayList Member (" + totalSize + ") : ");
        } else if (list instanceof Vector) {
            System.out.println("Vector Member (" + totalSize + ") : ");
        } else {
            System.out.println("Unknown Member (" + totalSize + ") : ");
        }

        for (Integer item : list) {
            System.out.print("[" + item + "]");
        }
        System.out.println("\n");
    }

}
