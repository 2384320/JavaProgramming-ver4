import java.util.*;

public class Practice08 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 몇개?>>");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int num = r.nextInt(100) + 1;
            arr[i] = num;
            for (int j = 0; j < i; j++) {
                if (arr[j] == num) {
                    i--;
                    break;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
            if ((i+1) % 10 == 0) System.out.println();
        }
    }
}
