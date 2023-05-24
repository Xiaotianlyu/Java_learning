package Interface.exer3;

public class ElectricVehicle extends Vehicle implements IPower{
    public ElectricVehicle() {
    }

    public ElectricVehicle(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void run() {
        System.out.println("电动车用电驱动行驶");
    }

    @Override
    public void power() {
        System.out.println("电动车使用电力");
    }
}
