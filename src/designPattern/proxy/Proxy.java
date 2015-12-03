package designPattern.proxy;

/**
 * Created by 0915183 on 2015-12-02.
 */
public class Proxy implements IService {

    IService service;

    @Override
    public String runSomething() {
        service = new ProxyService();
        System.out.println("control flow....");
        return service.runSomething();
    }
}
