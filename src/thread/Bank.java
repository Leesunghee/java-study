package thread;

/**
 * Created by sunghee on 2015. 12. 20..
 */
public class Bank {
    private String account;
    private int money;

    public Bank(String account, int money) {
        this.account = account;
        this.money = money;
    }

    public synchronized void deposit(int money) {
        this.money += money;
    }

    public synchronized boolean withdraw(int money) {
        if (this.money >= money) {
            this.money -= money;
            return true;
        } else {
            return false;
        }
    }

    public String getAccount() {
        return account;
    }
}
