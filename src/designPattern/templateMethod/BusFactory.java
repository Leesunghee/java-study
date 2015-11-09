package designPattern.templateMethod;

/**
 * Created by 0915183 on 2015-11-09.
 */
public class BusFactory extends AbtractFactory {
    @Override
    protected void init() {
        System.out.println("but init");
    }

    @Override
    protected void make() {
        System.out.println("bus make");
    }

    @Override
    protected void destory() {
        System.out.println("bus destory");
    }
}
