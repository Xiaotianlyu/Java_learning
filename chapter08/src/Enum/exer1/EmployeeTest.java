package Enum.exer1;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("xiaoming",18,Status.VOCATION);
        Employee e2 = new Employee("小林",22,Status.DIMISSION);
        Employee e3 = new Employee("wang",33,Status.BUSY);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
    }
}
