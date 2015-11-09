package designPattern.singleton;

/**
 * Created by sunghee on 2015. 11. 8..
 */
public class Singleton {

    private volatile static Singleton instance = null;


    private Singleton() {
        System.out.println("create instance");
    }

//    static {
//
//        System.out.println("exec in static block");
//        if (instance == null) {
//            synchronized (Singleton.class) {
//                instance = new Singleton();
//            }
//        }
//    }

    public static Singleton getInstance() {
        if (instance == null) {
            System.out.printf("instance is null");
            synchronized (Singleton.class) {
                instance = new Singleton();
            }
        }
        return instance;
    }
}
