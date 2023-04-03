import java.util.Scanner;

public class Practice10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 원의 중심과 반지름 입력 >> ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double radius1 = sc.nextDouble();

        System.out.print("두번째 원의 중심과 반지름 입력 >> ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double radius2 = sc.nextDouble();

        double distance = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        if (distance < radius1 + radius2) System.out.println("두 원은 서로 겹친다.");
        else System.out.println("두 원은 서로 안겹친다.");

    }
}
