package collection.map.iteratingExample;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 0915183 on 2016-01-13.
 */

//This might look like a cleaner alternative for method "EntryExample"
// but in practice it is pretty slow and inefficient as getting values by a key might be time consuming(this method in different Map implementations is 20%-200% slower than method "EntryExample").
// If you have FindBugs installed, it will detect this and warn you about inefficient iteration. This method should be avoided.
public class IteratorExample2 {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        map.put(2, 2);
        map.put(3, 3);
        map.put(4, 4);
        map.put(5, 5);

        for (Integer key : map.keySet()) {
            Integer value = map.get(key);
            System.out.println("Key = " + key + ", Value = " + value);
        }
    }
}

//Conclusion
//If you need only keys or values from the map use method "KeyValueIteratingExample".
//If you are stuck with older version of Java (less than 5) or planning to remove entries during iteration you have to use method "IteratorExample".
//Otherwise use method "EntryExample".

