package collection.map.iteratingExample;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 0915183 on 2016-01-13.
 * This is the most common methodd. Should be used if you need both map keys and values in the loop.
 */
public class EntryExample {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        map.put(2, 2);
        map.put(3, 3);
        map.put(4, 4);
        map.put(5, 5);

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Key = " + entry.getKey() + " Value = " + entry.getValue());
        }
    }

}
