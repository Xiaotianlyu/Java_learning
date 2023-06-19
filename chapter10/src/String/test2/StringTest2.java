package String.test2;

/**
 * 获取一个字符串在另一个字符串中出现的次数。 比如：获取“ ab”在
 * “abkkcadkabkebfkabkskab” 中出现的次数
 */
public class StringTest2 {
    public static void main(String[] args) {
        String str = "abkkcadkabkebfkabkskab";
        String subString = "ab";
        System.out.println(getSubStringCount(str, subString));
    }

    /**
     * @param str       原来的字符串
     * @param subString 所包含的字符串
     * @return 字符串出现次数
     */
    public static int getSubStringCount(String str, String subString) {
        int count = 0;//记录次数
        int i = str.indexOf(subString);//判断是否包含subString

        if (str.length() > subString.length()){
            while (i >= 0) {
                count++;
                i = str.indexOf(subString, i + subString.length());
            }
        }

        return count;
    }
}
