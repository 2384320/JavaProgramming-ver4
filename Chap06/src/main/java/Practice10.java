import java.util.Random;
import java.util.Scanner;

public class Practice10 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Person s1, s2;

        System.out.print("1번째 선수 이름>>");
        s1 = new Person(sc.nextLine());
        System.out.print("2번째 선수 이름>>");
        s2 = new Person(sc.nextLine());

        while (true) {
            if (game(s1)) break;
            if (game(s2)) break;
        }
    }

    public static boolean game(Person s) {
        int num1, num2, num3;
        String str;
        boolean check = false;
        Random r = new Random();

        System.out.print("[" + s.getName() + "]:<Enter>");
        sc.nextLine();
        num1 = r.nextInt(3) + 1;
        num2 = r.nextInt(3) + 1;
        num3 = r.nextInt(3) + 1;
        if (num1 == num2 && num2 == num3) {
            str = s.getName() +"님이 이겼습니다!";
            check = true;
        }
        else str = "아쉽군요!";

        System.out.println("\t" + num1 + "\t" + num2 + "\t" + num3 + "\t" + str);
        return check;
    }
}
