import java.util.Scanner;

public class Practice09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("원의 중심과 반지름 입력 >> ");
        double xCenter = sc.nextDouble();
        double yCenter = sc.nextDouble();
        double radius = sc.nextDouble();

        System.out.print("점 입력 >> ");
        double x = sc.nextDouble();
        double x_result = x - xCenter;
        double y = sc.nextDouble();
        double y_result = y - yCenter;

        if (x_result*x_result + y_result*y_result <= radius*radius) System.out.println("점 (" + x + ", " + y + ")는 원 안에 있다.");
        else System.out.println("점 (" + x + ", " + y + ")는 원 안에 없다.");

    }
}
