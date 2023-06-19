package map.exer1;

import java.util.*;

/**
 * 练习 1：添加你喜欢的歌手以及你喜欢他唱过的歌曲
 */
public class SingerTest {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();

        //添加第一位歌手
        String singer1 = "林俊杰";

        ArrayList songs1 = new ArrayList();

        songs1.add("江南");
        songs1.add("曹操");
        songs1.add("小酒窝");
        songs1.add("没有如果");

        hashMap.put(singer1, songs1);//构建key value

        //添加第二位歌手
        String singer2 = "周杰伦";
        ArrayList songs2 = new ArrayList();

        songs2.add("夜曲");
        songs2.add("晴天");
        songs2.add("屋顶");

        hashMap.put(singer2, songs2);//构建key value

        //插入map
        Set set = hashMap.entrySet();
        //用迭代器遍历
        Iterator iterator = set.iterator();

        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println("歌手：" + entry.getKey());
            System.out.println("歌曲有：" + entry.getValue());
        }


    }
}
