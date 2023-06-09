package Abstract.exer2;

/**
 * 定义 SalariedEmployee 类继承 Employee 类，实现按月计算工资的员工处
 * 理。该类包括：private 成员变量 monthlySalary；
 * 实现父类的抽象方法 earnings(),该方法返回 monthlySalary 值；toString()方法输
 * 出员工类型信息及员工的 name，number,birthday
 */
public class SalariedEmployee extends Employee {
    private double monthlySalary;

    public SalariedEmployee() {
    }

    @Override
    public double earnings() {
        return monthlySalary;
    }

    public SalariedEmployee(String name, int number, MyDate birthday, double monthlySalary) {
        super(name, number, birthday);
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee[" + super.toString() + "]";
    }
}
