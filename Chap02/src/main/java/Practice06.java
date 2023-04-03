import java.util.Scanner;

public class Practice06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("1~99 사이의 정수를 입력하시오 >> ");
        int num = sc.nextInt();

        if (Integer.toString(num).contains("3") || Integer.toString(num).contains("6") || Integer.toString(num).contains("9")) {
            if (num/10 == 3 || num/10 == 6 || num/10 == 9) {
                if (num%10 == 3 || num%10 == 6 || num%10 == 9) {
                    System.out.println("박수짝짝");
                } else System.out.println("박수짝");
            } else System.out.println("박수짝");
        } else System.out.println("정적");
        sc.close();
    }
}
