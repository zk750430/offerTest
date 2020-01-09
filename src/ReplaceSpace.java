/**
 * @author： Administrator
 * @create： 2020-01-09 15:33
 * 说明：请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class ReplaceSpace {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("We Are Happy");
        System.out.println(ReplaceSpace.replaceSpace(sb));
    }

    /**
     * 也可直接使用原生方法解决
     * str.toString().replaceAll(" ","%20")
     *
     * @param str
     * @return
     */
    public static String replaceSpace(StringBuffer str) {
        if (str == null) {
            return null;
        }
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        int oldLength = str.length() - 1;
        int newLength = oldLength + count * 2;
        str.setLength(newLength + 1);
        while (oldLength >= 0) {
            if (str.charAt(oldLength) == ' ') {
                str.replace(newLength - 2, newLength + 1, "%20");
                newLength -= 3;
            } else {
                str.setCharAt(newLength, str.charAt(oldLength));
                newLength--;
            }
            oldLength--;
        }
        return str.toString();
    }
}
