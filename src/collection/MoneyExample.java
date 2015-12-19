package collection;

/**
 * Created by sungheelee on 2015. 12. 19..
 */
public class MoneyExample {
    private MoneyValue moneyVo = new MoneyValue();

    public static void main(String[] args) {
        MoneyExample example = new MoneyExample();
        example.init();
        example.add();
        example.printStatus();
    }

    private void init() {
        moneyVo.userName = "leesunghee";
        moneyVo.money = 34.44F;
    }

    private void add() {
        int balance = (int) (moneyVo.money + 1);
        moneyVo.money = (float) balance;
    }


    private void printStatus() {
        System.out.println("Current Balance =" + moneyVo.money + "$");
    }
}
