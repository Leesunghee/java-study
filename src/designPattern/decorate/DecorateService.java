package designPattern.decorate;

/**
 * Created by 0915183 on 2015-12-02.
 */
public class DecorateService implements IService {

    @Override
    public void runSomething() {
        String str = "decorate";
        System.out.printf(str + " runSomething");
    }
}
