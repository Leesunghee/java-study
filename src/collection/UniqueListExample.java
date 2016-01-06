package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by 0915183 on 2016-01-06.
 */
public class UniqueListExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(1);
        System.out.println(list.toString());
        List<Integer> uniqueList = new ArrayList<>(new HashSet<Integer>(list));
        System.out.println(uniqueList.toString());
    }
}
