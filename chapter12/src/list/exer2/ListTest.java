package list.exer2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 1、请定义方法 public static int listTest(Collection list,String s)统计集合中指定
 * 元素出现的次数
 * 2、创建集合，集合存放随机生成的 30 个小写字母
 * 3、用 listTest 统计，a、b、c、x 元素的出现次数
 */
public class ListTest {
    public static void main(String[] args) {
        List list = new ArrayList();

        //创建集合，集合存放随机生成的 30 个小写字母 97-122
        for (int i = 0; i < 30; i++) {
            list.add((char) (Math.random() * (122 - 97 + 1) + 97) + "");

        }
        System.out.println(list);

        int aCount = listTest(list, "a");
        int bCount = listTest(list, "b");
        int cCount = listTest(list, "c");
        int xCount = listTest(list, "x");

        System.out.println("a =" + aCount);
        System.out.println("b =" + bCount);
        System.out.println("c =" + cCount);
        System.out.println("x =" + xCount);


    }

    /**
     * 请定义方法 public static int listTest(Collection list,String s)统计集合中指定
     * 元素出现的次数
     *
     * @param list 随机生成的list
     * @param s    要找的对象
     * @return
     */
    public static int listTest(Collection list, String s) {

        int count = 0;//记录出现s次数

        //遍历list
        for (Object obj : list) {
            if (s.equals(obj)) {
                count++;
            }

        }
        return count;


    }
}


