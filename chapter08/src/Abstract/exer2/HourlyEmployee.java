package Abstract.exer2;

/**
 * 参照 SalariedEmployee 类定义 HourlyEmployee 类，实现按小时计算工资
 * 的员工处理。该类包括：
 * private 成员变量 wage 和 hour；
 * 实现父类的抽象方法 earnings(),该方法返回 wage*hour 值；
 * toString()方法输出员工类型信息及员工的 name，number,birthday。
 */
public class HourlyEmployee extends Employee {
    private double wage;//单位小时工资
    private int hour;//工作时常

    public HourlyEmployee() {
    }

    public HourlyEmployee(String name, int number, MyDate birthday, double wage, int hour) {
        super(name, number, birthday);
        this.wage = wage;
        this.hour = hour;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public double earnings() {
        return wage * hour;
    }
    public String toString() {
        return "HourlyEmployee[" + super.toString() + "]";
    }
}
