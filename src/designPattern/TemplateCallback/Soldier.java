package designPattern.TemplateCallback;



/**
 * Created by sungheelee on 2015. 12. 5..
 */
public class Soldier {


    public void runContext(String weaponSound) {
        System.out.println("Start war!!");
        //strategy.runStrategy();

        executeWeapon(weaponSound).runStrategy();
        System.out.println("End war!!");
    }

    private Strategy executeWeapon(final String weaponSound) {

        return new Strategy() {
            @Override
            public void runStrategy() {
                System.out.println(weaponSound);
            }
        };

    }
}
