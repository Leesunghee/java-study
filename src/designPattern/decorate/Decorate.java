package designPattern.decorate;

/**
 * Created by 0915183 on 2015-12-02.
 */
public class Decorate implements IService {

    DecorateService service;

    @Override
    public String runSomething() {
        service = new DecorateService();
        System.out.println("control flow..");
        return service.runSomething();
    }
}
