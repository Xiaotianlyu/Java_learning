package list.exer1;

import java.util.Objects;

/**
 * 定义学生类，属性为姓名、年龄，提供必要的 getter、setter 方法，构造器，
 * toString()，equals()方法。
 * •使用 ArrayList 集合，保存录入的多个学生对象。
 * •循环录入的方式，1：继续录入，0：结束录入。
 * •录入结束后，用 foreach 遍历集合。
 */
public class Student {
    String name;
    int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "list.exer1.Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
