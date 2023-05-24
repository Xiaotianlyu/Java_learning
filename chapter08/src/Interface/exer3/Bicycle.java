package Interface.exer3;

public class Bicycle extends Vehicle {
    public Bicycle() {
    }

    public Bicycle(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void run() {
        System.out.println("自行车用脚蹬");
    }
}
