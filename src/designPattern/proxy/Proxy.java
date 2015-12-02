package designPattern.proxy;

/**
 * Created by 0915183 on 2015-12-02.
 */
public class Proxy implements IService {

    IService service = new ProxyService();

    @Override
    public void runSomething() {
        System.out.println("control flow....");
        service.runSomething();
    }
}
