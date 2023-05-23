import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class Practice11_1 {
    static Vector<Nation> v;
    static Scanner sc;
    static void run() {
        sc = new Scanner(System.in);
        v = new Vector<>();
        System.out.println("*** 수도 맞추기 게임을 시작합니다. ***");

        while (true) {
            System.out.print("입력:1, 퀴즈:2, 종료:3 >> ");
            int command = sc.nextInt();

            switch (command) {
                case 1: insert(); break;
                case 2: quiz(); break;
                case 3: finish(); break;
                default: System.out.println("<<명령어가 잘못 됐습니다.>>"); break;
            }
        }

    }

    static void insert() {
        Nation n;
        sc = new Scanner(System.in);

        System.out.println("현재 " + v.size() + "개 나라와 수도가 입력되어 있습니다.");
        while (true) {
            System.out.print("나라와 수도 입력 " + (v.size() + 1) + " >> ");
            String country = sc.next();

            if (country.equals("그만")) return;
            else if (overlap(country)) {
                System.out.println(country + "는 이미 있습니다!");
                continue;
            }

            String capital = sc.next();

            n = new Nation(country, capital);
            v.add(n);
        }
    }

    static boolean overlap(String country) {
        for (Nation n : v) {
            String c = n.getCountry();
            if (c.equals(country)) return true;
        }
        return false;
    }

    static void quiz() {
        Random r = new Random();
        sc = new Scanner(System.in);
        while (true) {
            int quizIdx = r.nextInt(v.size());
            System.out.print(v.get(quizIdx).getCountry() + "의 수도는? ");
            String answer = sc.next();
            if (answer.equals("그만")) break;
            if (grade(quizIdx, answer)) System.out.println("정답!!");
            else System.out.println("아닙니다!!");
        }
    }

    static boolean grade(int quizIdx, String answer) {
        return v.get(quizIdx).getCapital().equals(answer);
    }

    static void finish() {
        System.out.println("게임을 종료합니다.");
        System.exit(0);
    }

    public static void main(String[] args) {
        run();
    }
}
