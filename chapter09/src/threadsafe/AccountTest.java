package threadsafe;

/**
 * 银行有一个账户。 有两个储户分别向同一个账户存 3000 元，每次存 1000，存 3 次。每次存完打印账户余额。
 * 问题：该程序是否有安全问题，如果有，如何解决？
 * 【提示】
 * 1，明确哪些代码是多线程运行代码，须写入 run()方法
 * 2，明确什么是共享数据。
 * 3，明确多线程运行代码中哪些语句是操作共享数据的。
 * 【拓展问题】可否实现两个储户交替存钱的操作
 */
public class AccountTest {
    public static void main(String[] args) {
        Account acct1 = new Account();

        Customer customer1 = new Customer(acct1,"甲方");
        Customer customer2 = new Customer(acct1,"已方");

        customer1.start();
        customer2.start();

    }
}

class Account {//账户
    private double balance;//余额

    public synchronized void deposit(double amount) {//存钱方法
        if (amount > 0) {
            balance += amount;
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() + "存钱1000，余额为" + balance);
    }


}

class Customer extends Thread {//顾客
    Account account;//账户

    public Customer(Account account) {//构造器
        this.account = account;
    }

    public Customer(Account account, String name) {//构造器2
        super(name);
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            account.deposit(1000);
        }
    }
}