import java.util.Scanner;
import java.util.Vector;

public class Practice01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> v = new Vector<>();

        System.out.print("정수(-1이 입력될 때까지)>> ");
        while (true) {
            int num = sc.nextInt();
            if (num == -1) break;
            v.add(num);
        }

        int max = v.get(0);
        for (int i = 1; i < v.size(); i++) {
            max = Math.max(max, v.get(i));
        }
        System.out.print("가장 큰 수는 " + max);
    }
}
