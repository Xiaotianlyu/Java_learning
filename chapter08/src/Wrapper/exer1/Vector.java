package Wrapper.exer1;

import java.util.Scanner;

/**
 * 利用 Vector 代替数组处理：从键盘读入学生成绩（以负数代表输入结束），找
 * 出最高分，并输出学生成绩等级。
 * • 提示：数组一旦创建，长度就固定不变，所以在创建数组前就需要知道它的长度。而
 * 向量类 java.util.Vector 可以根据需要动态伸缩。
 * • 创建 Vector 对象：Vector v=new Vector();
 * • 给向量添加元素：v.addElement(Object obj); //obj 必须是对象
 * • 取出向量中的元素：Object obj=v.elementAt(0);
 * – 注意第一个元素的下标是 0，返回值是 Object 类型的。
 * • 计算向量的长度：v.size();
 * • 若与最高分相差 10 分内：A 等；20 分内：B 等；30 分内：C 等；其它：D 等
 */

public class Vector {

    public static void main(String[] args) {

        //1 创建对象
        Vector v = new Vector();
        Scanner scanner = new Scanner(System.in);

        //获取最大分数值
        int maxScore = 0;

        //2 从键盘获取多个学生成绩 存放到V中
        while (true) {
            System.out.println("请输入学生成绩（以负数输入代表结束）：");
            int intScore = scanner.nextInt();

            //判断分数是否为负数
            if (intScore < 0) {
                break;
            }
//            装箱 int->Integer
//            Integer score = Integer.valueOf(intScore);
//            v.addElement(score);

            //自动装箱
            v.addElement(intScore);

            //3 获取最大值
            if (maxScore < intScore){
                maxScore = intScore;
            }

        }

        //4.依次获取每个学生的成绩，与最高分进行比较，获取学生成绩等级
        for (int i = 0; i < v.size(); i++) {
            v.elementAt
        }

        scanner.close();

    }

    private void addElement(int intScore) {
    }

    private void addElement() {
    }


}
