package designPattern.TemplateCallback;



/**
 * Created by sungheelee on 2015. 12. 5..
 */
public class Client {
    public static void main(String[] args) {


        Soldier soldier = new Soldier();


//        soldier.runContext(new Strategy() {
//            @Override
//            public void runStrategy() {
//                System.out.println("Bang bang!!!!!");
//            }
//        });
//
//
//        System.out.println();
//        soldier.runContext(new Strategy() {
//            @Override
//            public void runStrategy() {
//                System.out.println("Chang chang !!!!!");
//            }
//        });

        soldier.runContext("Banggggg");
        soldier.runContext("Chhhhhhhh");
    }
}
