package designPattern.singleton;

/**
 * Created by sunghee on 2015. 11. 8..
 */
public class SingletonTest {
    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();

        if (singleton == singleton1) {
            System.out.println("singleton == singleton2");
        }
    }
}
