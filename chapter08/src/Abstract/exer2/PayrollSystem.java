package Abstract.exer2;

import java.util.Scanner;

/**
 * 定义 PayrollSystem 类，创建 Employee 变量数组并初始化，该数组存放
 * 各类雇员对象的引用。利用循环结构遍历数组元素，输出各个对象的类
 * 型,name,number,birthday,以及该对象生日。当键盘输入本月月份值时，如果本
 * 月是某个 Employee 对象的生日，还要输出增加工资信息。
 */
public class PayrollSystem {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        Employee[] employees1 = new Employee[2];
        employees1[0] = new SalariedEmployee("小明", 1001,
                new MyDate(1992, 12, 21), 18000);

        employees1[1] = new SalariedEmployee("小红", 1003,
                new MyDate(1994, 11, 22), 29999);

        System.out.println("请输入当前的月份：");
        int month = scan.nextInt();

        for (int i = 0; i < employees1.length; i++) {
            System.out.println(employees1[i].toString());
            System.out.println("工资为" + employees1[i].earnings());

            if(month == employees1[i].getBirthday().getMonth()){
                System.out.println("生日快乐，加薪100！");
            }
        }
    }

}
