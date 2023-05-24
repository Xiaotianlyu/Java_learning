package Inner.exer1;

/**
 * 编写一个匿名内部类，它继承 Object，并在匿名内部类中，声明一个方法
 * public void test()打印尚硅谷。
 */

public class ObjectTest {
    public static void main(String[] args) {
        new Object(){
            public void test(){
                System.out.println("尚硅谷");
            }

        }.test();

    }

}
