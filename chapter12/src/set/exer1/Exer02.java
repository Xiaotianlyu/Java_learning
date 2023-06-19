package set.exer1;

import java.util.HashSet;
import java.util.Iterator;

/**
 * 编写一个程序，获取 10 个 1 至 20 的随机数，要求随机数不能重复。并把最终
 * 的随机数输出到控制台。
 */
public class Exer02 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();

        while (hashSet.size() < 10) {

            int number = (int) (Math.random() * (20 - 1 + 1) + 1);
            hashSet.add(number);

        }

        //遍历
        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
