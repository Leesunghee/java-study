package designPattern.singleton;

/**
 * Created by sunghee on 2015. 11. 3..
 */
public class SingletonPattern {

    private static SingletonPattern instance = new SingletonPattern();

    public static SingletonPattern getInstance() {
        return instance;
    }


    private SingletonPattern() {
    }

    public int add(int x, int y) {
        return x + y;
    }

}
