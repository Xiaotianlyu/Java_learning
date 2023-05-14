package tostring.exer1;

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(2.5);
        Circle c2 = new Circle("white",2.4,2);

        //判断颜色
        System.out.println(c1.getColor().equals(c2.getColor()));
        System.out.println(c1.color.equals(c2.color));
        //判断半径
        System.out.println(c1.equals(c2));
        //打印半径
        System.out.println(c1);
        System.out.println(c1.tostring());
    }
}
