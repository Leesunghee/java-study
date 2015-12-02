package designPattern.proxy;

/**
 * Created by 0915183 on 2015-12-02.
 */
public class ProxyService implements IService {
    @Override
    public void runSomething() {
        System.out.printf("runSomething");
    }
}
