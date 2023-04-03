import java.util.*;

public class Practice04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 3개 입력 >> ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int result = 0;

        if (num1 >= num2 && num1 <= num3) result = num1;
        else if (num2 >= num1 && num2 <= num3) result = num2;
        else result = num3;

        System.out.println("중간 값은 " + result);
        sc.close();
    }
}