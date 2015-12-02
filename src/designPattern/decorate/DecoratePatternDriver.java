package designPattern.decorate;

/**
 * Created by 0915183 on 2015-12-02.
 */
public class DecoratePatternDriver {

    public static void main(String[] args) {
        IService service = new Decorate();

        service.runSomething();
    }
}
