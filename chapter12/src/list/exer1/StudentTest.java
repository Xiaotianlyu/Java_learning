package list.exer1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;

/**
 * 定义学生类，属性为姓名、年龄，提供必要的 getter、setter 方法，构造器，
 * toString()，equals()方法。
 * •使用 ArrayList 集合，保存录入的多个学生对象。
 * •循环录入的方式，1：继续录入，0：结束录入。
 * •录入结束后，用 foreach 遍历集合。
 */
public class StudentTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(in);
        List list = new ArrayList();

        System.out.println("请录入学生的信息：");

        while (true) {
            System.out.println("1：继续录入，0：结束录入");
            int selection = scan.nextInt();

            if (selection == 0) {
                break;
            }

            System.out.print("请输入学生姓名：");
            String name = scan.next();
            System.out.print("请输入学生年龄：");
            int age = scan.nextInt();

            Student s = new Student(name, age);
            list.add(s);

        }
        System.out.println("遍历学生信息：");
        for (Object s : list) {
            System.out.println(s.toString());
        }


        scan.close();


    }
}
