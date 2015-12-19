package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by sungheelee on 2015. 12. 19..
 */
public class MapExample1 {

    private HashMap<String, Integer> asciiMap = new HashMap<String, Integer>();

    public static void main(String[] args) {
        MapExample1 example = new MapExample1();
        example.init();
        example.execute();


    }

    private void execute() {
        Set<Map.Entry<String, Integer>> entrySet = asciiMap.entrySet();

        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.print("[" + entry.getKey() + "/" + entry.getValue() + "] ");
        }
        System.out.print("\n");

        System.out.println("asciiMap contains 69 value : " + asciiMap.containsValue(69));
        System.out.println("asciiMap contains c key : " + asciiMap.containsKey("C"));
        asciiMap.remove("Z");

        Collection<Integer> values = asciiMap.values();
        for (Integer value :
                values) {
            System.out.print("(" + value + ")");
        }
        System.out.print("\n");

        Set<String> keySet = asciiMap.keySet();
        for (String key :
                keySet) {
            System.out.print("[" + asciiMap.get(key) + "]");
        }
        System.out.print("\n");

    }

    private void init() {
        for (int i = 65; i <= 90; i++) {
            asciiMap.put(String.valueOf((char) i), i);
        }
    }
}
