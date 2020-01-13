import java.util.Arrays;

/**
 * @author： Administrator
 * @create： 2020-01-10 11:17
 * 说明：把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 */
public class MinNumberInRotateArray {
    public static void main(String[] args) {
        int[] array = new int[]{3,4,5,1,2};
        minNumberInRotateArray(array);

    }
    public static int minNumberInRotateArray(int[] array) {

        if (array.length == 0) {
            return 0;
        }
        int index = 0;
        int min = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] > array[i]) {
                min = array[i];
                index = i;
            }
        }
        int[] arr = new int[array.length];
        int[] ints1 = Arrays.copyOfRange(array, index, array.length);
        int[] ints2 = Arrays.copyOf(array, index);
        System.arraycopy(ints1,0,arr,0,ints1.length);
        System.arraycopy(ints2,0,arr,ints1.length,ints2.length);
        return arr[0];
    }
}
