import java.util.Arrays;
import java.util.Scanner;

/**
 * @author sjw
 * @date 2022/7/8 - 15:23
 */
public class sort_pop {
    public static void main(String[] args) {
        int[] arr = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] arrs = MaoPao(arr);
        System.out.println(Arrays.toString(arrs));
    }

    public static int[] MaoPao(int[] arr) {
        //外层循环
        for (int i = 0; i < arr.length - 1; i++) {
            //内层循环
            for (int j = 0; j < arr.length - 1 - i; j++) {
                //两两比较
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
