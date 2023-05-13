import java.util.Arrays;

class ArrayUtil {
    public static int[] concat(int[] a, int[] b) {
        int length = a.length + b.length;
        int[] arr = new int[length];
        int idx = 0;

        for (int i = 0; i < a.length; i++) {
            arr[idx++] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            arr[idx++] = b[i];
        }
        return arr;
    }
    public static void print(int[] a) {
        System.out.println(Arrays.toString(a));
    }
}

public class Practice09 {
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 7, 9};
        int[] arr2 = {3, 6, -1, 100, 77};
        int[] arr3 = ArrayUtil.concat(arr1, arr2);
        ArrayUtil.print(arr3);
    }
}
