package designPattern.strategyPattern;

/**
 * Created by sungheelee on 2015. 12. 5..
 */
public class StrategyGun implements Strategy {

    @Override
    public void runStrategy() {
        System.out.println("Bang bang !!");
    }
}
