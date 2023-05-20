import java.util.Scanner;
import java.util.Vector;

public class Practice04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> v = new Vector<>();

        while (true) {
            System.out.print("강수량 입력 (0 입력시 종료) >> ");
            int num = sc.nextInt();
            if (num == 0) break;

            v.add(num);
            int sum = 0;
            for (int i = 0; i < v.size(); i++) {
                System.out.print(v.get(i) + " ");
                sum += v.get(i);
            }
            System.out.println();

            int avg = sum/v.size();
            System.out.println("현재 평균 " + avg);
        }
        sc.close();
    }
}
