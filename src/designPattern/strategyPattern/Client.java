package designPattern.strategyPattern;

/**
 * Created by sungheelee on 2015. 12. 5..
 */
public class Client {
    public static void main(String[] args) {

        Strategy strategy = null;
        Soldier soldier = new Soldier();

        strategy = new StrategyGun();
        soldier.runContext(strategy);


        System.out.println();

        strategy = new StrategySword();
        soldier.runContext(strategy);
    }
}
