package Interface.exer3;

public class VehicleTest {
    public static void main(String[] args) {
        Developer D1 = new Developer();
        //创建三个交通工具 保存在数组中
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Bicycle("长城","黑色");
        vehicles[1] = new ElectricVehicle("小蓝","蓝色");
        vehicles[2] = new Car("宝马","黑色","1243444");

        for (int i = 0; i < vehicles.length; i++) {
            D1.takingVehicle(vehicles[i]);

            if (vehicles[i] instanceof IPower){
                ((IPower) vehicles[i]).power();
            }
        }



    }
}
