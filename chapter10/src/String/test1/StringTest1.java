package String.test1;

/**
 * 将一个字符串进行反转。将字符串中指定部分进行反转。比如
 * “abcdefg”反转为”abfedcg"
 */
public class StringTest1 {
    public static void main(String[] args) {
        String str = new String("abcdefg");
        String str2 = reverse(str, 2, 5);
        String str3 = reverse2(str, 2, 5);
        System.out.println(str2);
        System.out.println(str3);

    }


    //构造reverse方法1
    public static String reverse(String str, int fromIndex, int toIndex) {
        char[] arr = str.toCharArray();//string 转成 数组

        //调转排序
        for (int i = fromIndex, j = toIndex; i < j; i++, j--) {

            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        return new String(arr);
    }

    //构造reverse方法2
    public static String reverse2(String str, int fromIndex, int toIndex) {
        //获取第一部分 没有变化的部分
        String finalStr = str.substring(0, fromIndex);
        //获取中间转换部分
        for (int i = toIndex; i >= fromIndex; i--) {
            finalStr += str.charAt(i);
        }
        //获取最后一部分没有变化的
        return finalStr += str.substring(toIndex+1);
    }
}
