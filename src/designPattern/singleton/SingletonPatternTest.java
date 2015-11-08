package designPattern.singleton;

import designPattern.singleton.SingletonPattern;

/**
 * Created by sunghee on 2015. 11. 3..
 */
public class SingletonPatternTest {

    public static void main(String[] args) {


        SingletonPattern singletonPattern = SingletonPattern.getInstance();

        System.out.println(singletonPattern.add(5, 10));
    }
}
