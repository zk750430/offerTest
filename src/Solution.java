/**
 * @author： Administrator
 * @create： 2020-01-09 15:19
 * 说明：在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，
 * 判断数组中是否含有该整数。
 */
public class Solution {
    public static void main(String[] args) {
        int[][] array = new int[2][2];
        array[0][0] = 1;
        array[0][1] = 2;
        array[1][0] = 3;
        array[1][0] = 4;
        System.out.println(Solution.find3(0, array));
    }

    public static boolean find(int target, int[][] array) {
        /**
         * 从左下找
         *
         */
        int col = array.length;
        if (col == 0) {
            return false;
        }
        int row = array[0].length;
        if (row == 0) {
            return false;
        }
        int rows = 0;
        while (col > 0 && rows < row) {
            if (target > array[col - 1][rows]) {
                rows++;
            } else if (target < array[col - 1][rows]) {
                col--;
            } else {
                return true;
            }
        }

        return false;
    }

    public static boolean find2(int target, int[][] array) {
        /**
         * 直接查找法
         *
         */
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean find3(int target, int[][] array) {
        /**
         * 右上查找
         *
         */
        int col = array.length;
        if (col == 0) {
            return false;
        }
        int row = array[0].length;
        if (row == 0) {
            return false;
        }
        int rows = row - 1;
        int cols = 0;
        while (cols < col && rows >= 0) {
            if (target < array[cols][rows]) {
                rows--;
            } else if (target > array[cols][rows]) {
                cols++;
            } else {
                System.out.printf("行数：%d,列数：%d。\n", cols, rows);
                return true;
            }
        }
        return false;
    }

}
