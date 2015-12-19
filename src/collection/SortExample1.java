package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/**
 * Created by sungheelee on 2015. 12. 19..
 */
public class SortExample1 {
    private final int LENGTH = 15;
    private Random random;
    private String[] strArray;
    private ArrayList<String> strList;

    public static void main(String[] args) {
        SortExample1 example = new SortExample1();
        example.init();
        example.sort();
    }

    private void init() {
        this.random = new Random();
        strArray = new String[this.LENGTH];
        strList = new ArrayList<String>();

        for (int i = 0; i < LENGTH; i++) {
            String item = String.valueOf((char) (random.nextInt(26) + 65));
            strArray[i] = item;
            strList.add(item);

        }
        this.printArrayItem();
        this.printArrayListItem();
    }

    public void sort() {
        Arrays.sort(strArray);
        Collections.sort(strList);

        this.printArrayItem();
        this.printArrayListItem();
    }

    private void printArrayListItem() {
        for (int i = 0; i < strList.size(); i++) {
            System.out.print("(" + strList.get(i) + ") ");
        }
        System.out.print("\n");
    }

    private void printArrayItem() {
        for (int i = 0; i < strArray.length; i++) {
            System.out.print("[" + strArray[i] + "] ");
        }
        System.out.print("\n");
    }


}
