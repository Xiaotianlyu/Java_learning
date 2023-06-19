package lifecycle;

/**
 * 新年倒计时，每隔一秒输出数字，10，9，8。。。1，最后输出：新年快乐！
 */
public class HappyNewYear {
    public static void main(String[] args) {


        for (int i = 10; i >= 0; i--) {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if(i>0){
                System.out.println(i);
            }else {
                System.out.println("Happy New Year!");
            }

        }
    }
}
