import java.util.*;

public class Practice11_2 {
    static List<String> list;
    static HashMap<String, String> hm;
    static Scanner sc;
    static void run() {
        sc = new Scanner(System.in);
        hm = new HashMap<>();
        list = new ArrayList<>();
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
        sc = new Scanner(System.in);

        System.out.println("현재 " + hm.size() + "개 나라와 수도가 입력되어 있습니다.");
        while (true) {
            System.out.print("나라와 수도 입력 " + (hm.size() + 1) + " >> ");
            String country = sc.next();

            if (country.equals("그만")) return;
            else if (overlap(country)) {
                System.out.println(country + "는 이미 있습니다!");
                continue;
            }
            String capital = sc.next();

            hm.put(country, capital);
            list.add(country);
        }
    }

    static boolean overlap(String country) {
        for (String c : hm.keySet()) {
            if (c.equals(country)) return true;
        }
        return false;
    }

    static void quiz() {
        Random r = new Random();
        sc = new Scanner(System.in);
        while (true) {
            int quizIdx = r.nextInt(hm.size());
            System.out.print(list.get(quizIdx) + "의 수도는? ");
            String answer = sc.next();
            if (answer.equals("그만")) break;

            if (hm.get(list.get(quizIdx)).equals(answer)) System.out.println("정답!!");
            else System.out.println("아닙니다!!");
        }
    }

    static void finish() {
        System.out.println("게임을 종료합니다.");
        System.exit(0);
    }

    public static void main(String[] args) {
        run();
    }
}
