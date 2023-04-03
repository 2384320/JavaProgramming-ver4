import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("원화를 입력하세요 (단위: 원) >> ");
        double money = sc.nextDouble();
        System.out.print((int)money + "원은 $" + money/1100.0 + "입니다.");
        sc.close();
    }
}
