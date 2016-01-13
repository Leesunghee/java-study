package collection.map.iteratingExample;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 0915183 on 2016-01-13.
 * If you need only keys or values from the map, you can iterate over keySet or values instead of entrySet.
 */

public class KeyValueIteratingExample {

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        map.put(2, 2);
        map.put(3, 3);
        map.put(4, 4);
        map.put(5, 5);

        for (Integer key : map.keySet()) {
            System.out.println("Key =" + key);
        }

        for (Integer value : map.values()) {
            System.out.println("Value =" + value);
        }
    }
}
