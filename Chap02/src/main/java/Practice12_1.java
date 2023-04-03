import java.util.Scanner;

public class Practice12_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("연산 >> ");
        int num1 = sc.nextInt();
        String operator = sc.next();
        int num2 = sc.nextInt();
        System.out.print(num1 + " " + operator + " " + num2 + "의 계산 결과는 ");
        switch (operator) {
            case "+":
                System.out.println(num1+num2);
                break;
            case "-":
                System.out.println(num1-num2);
                break;
            case "*":
                System.out.println(num1*num2);
                break;
            case "/":
                System.out.println(num1/num2);
                break;
            default:
                System.out.println("잘못입력");
                break;
        }
        sc.close();
    }
}
