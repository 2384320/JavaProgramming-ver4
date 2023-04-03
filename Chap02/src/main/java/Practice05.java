import java.util.Scanner;

public class Practice05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 3개 입력 >> ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int max = 0, sum = 0;

        if (num1 >= num2 && num1 >= num3) {
            max = num1;
            sum = num2 + num3;
        }
        else if (num2 >= num1 && num2 >= num3) {
            max = num2;
            sum = num1 + num3;
        }
        else {
            max = num3;
            sum = num1 + num2;
        }

        System.out.println(max < sum ? "삼각형이 됩니다." : "삼각형이 안됩니다.");
        sc.close();
    }
}
