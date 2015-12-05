package designPattern.strategyPattern;

/**
 * Created by sungheelee on 2015. 12. 5..
 */
public class StrategySword implements Strategy {
    @Override
    public void runStrategy() {
        System.out.println("Chang chang!!");
    }
}
