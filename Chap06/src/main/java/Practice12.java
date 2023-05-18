import java.util.Random;
import java.util.Scanner;

public class Practice12 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("겜블링 게임에 참여할 선수 숫자>>");
        int num = Integer.parseInt(sc.nextLine());
        Person[] s = new Person[num];

        for (int i = 0; i < num; i++) {
            System.out.print((i + 1) + "번째 선수 이름>>");
            s[i] = new Person(sc.nextLine());
        }

        while (true) {
            for (int i = 0; i < num; i++) {
                if (game(s[i])) System.exit(0);
            }
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
