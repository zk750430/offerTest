/**
 * @author： Administrator
 * @create： 2020-01-13 13:10
 * 说明：一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 */
public class JumpFloor {
    public static void main(String[] args) {
        System.out.println(jumpFloor1(5));
    }

    /**
     * 动态规划：
     * 动规解题的一般思路
     * 1. 将原问题分解为子问题 把原问题分解为若干个子问题，
     * 子问题和原问题形式相同或类似，只不过规模变小了。
     * 子问题都解决，原问题即解决。
     * 子问题的解一旦求出就会被保存，所以每个子问题只需求 解一次。
     *
     * @param n
     * @return
     */
    public static final int COUNT = 2;
    public static int jumpFloor(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n <= COUNT) {
            return n;
        }
        int temp = 0;
        int first = 1;
        int pre = 2;
        for (int i = 3; i <= n; i++) {
            temp = first + pre;
            first = pre;
            pre = temp;
        }
        return temp;
    }

    /**
     * 通过分析得到
     * n=1,结构为1，
     * n=2,结果为2，
     * n>=3，符合下面的方程式
     * f(n) = f(n-1)+f(n-2)
     * 所有可通过递归实现
     *
     * @param n
     * @return
     */
    public static int jumpFloor1(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n <= COUNT) {
            return n;
        }

        return jumpFloor1(n - 1) + jumpFloor1(n - 2);
    }
}
