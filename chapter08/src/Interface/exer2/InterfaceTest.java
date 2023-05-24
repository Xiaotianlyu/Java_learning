package Interface.exer2;

public class InterfaceTest {
    public static void main(String[] args) {
        ComparableCircle c1 = new ComparableCircle(2.3);
        ComparableCircle c2 = new ComparableCircle(2.3);

        int compareValue = c1.compareTo(c2);
        if (compareValue > 0) {
            System.out.println("c1大");
        } else if (compareValue < 0){
            System.out.println("c2大");
        }else {
            System.out.println("一样大");
        }
    }
}
