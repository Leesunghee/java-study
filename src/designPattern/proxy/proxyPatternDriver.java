package designPattern.proxy;

/**
 * Created by 0915183 on 2015-12-02.
 */
public class ProxyPatternDriver {
    public static void main(String[] args) {

        //Service service = new Service();
        //service.runSomething();

        IService service = new Proxy();
        service.runSomething();

    }
}
