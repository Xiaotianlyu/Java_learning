package object.exer1;

public class OrderTest {
    public static void main(String[] args) {
        Order o1 = new Order(1001, "AA");
        Order o2 = new Order(1001, "AA");

        System.out.println(o1.equals(o2));


    }
}
