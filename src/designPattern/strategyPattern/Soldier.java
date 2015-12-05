package designPattern.strategyPattern;

/**
 * Created by sungheelee on 2015. 12. 5..
 */
public class Soldier {


    public void runContext(Strategy strategy) {
        System.out.println("Start war!!");
        strategy.runStrategy();
        System.out.println("End war!!");
    }
}
