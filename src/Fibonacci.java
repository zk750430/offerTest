/**
 * @author： Administrator
 * @create： 2020-01-10 11:36
 * 说明：大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
 * n<=39
 */
public class Fibonacci {

    public static final int FLAG1 = 1;
    public static final int FLAG2 = 2;

    public static void main(String[] args) {
        int count = 39;
        for (int i = 0; i <= count; i++) {
            System.out.println(fibonacci(i));
        }

    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == FLAG1 || n == FLAG2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
