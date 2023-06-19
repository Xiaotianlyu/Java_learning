package thread;

/**
 * 创建两个分线程，其中一个线程遍历100以内的偶数，另一个线程遍历100以内的奇数 方法一
 */
class EvenNumberPrint extends Thread {//打印偶数

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}

class OddNumberPrint extends Thread {//打印奇数

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}

public class PrintNumber {
    public static void main(String[] args) {
        EvenNumberPrint t1 = new EvenNumberPrint();
        OddNumberPrint t2 = new OddNumberPrint();

        t1.start();
        t2.start();
    }

}
