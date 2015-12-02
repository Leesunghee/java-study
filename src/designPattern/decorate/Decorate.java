package designPattern.decorate;

/**
 * Created by 0915183 on 2015-12-02.
 */
public class Decorate implements IService {

    DecorateService service = new DecorateService();

    @Override
    public void runSomething() {
        System.out.println("control flow..");
        service.runSomething();
    }
}
