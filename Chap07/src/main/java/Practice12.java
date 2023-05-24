import java.util.*;

public class Practice12 {
    static Vector<Word> v;
    static Scanner sc;

    static void ready() {
        v = new Vector<>();

        v.add(new Word("love", "사랑"));
        v.add(new Word("animal", "동물"));
        v.add(new Word("painting", "그림"));
        v.add(new Word("baby", "아기"));
        v.add(new Word("eye", "눈"));
        v.add(new Word("picture", "사진"));
        v.add(new Word("bear", "곰"));
        v.add(new Word("society", "사회"));
        v.add(new Word("human", "인간"));
    }
    static void insert() {
        sc = new Scanner(System.in);
        System.out.println("영어 단어에 그만을 입력하면 종료합니다.");

        while (true) {
            System.out.print("영어 한글 입력 >> ");
            String w = sc.next();
            if (w.equals("그만")) return;
            String m = sc.next();

            v.add(new Word(w, m));
        }
    }

    static void play() {
        sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("현재 " + v.size() + "개의 단어가 들어 있습니다. -1을 입력하면 종료합니다.");

        while (true) {
            int idx = r.nextInt(v.size());
            String question = v.get(idx).getWord();
            System.out.println(question + "?");

            List<String> list = new ArrayList<>();
            list.add(v.get(idx).getMean());
            for (int i = 0; i < 3; i++) {
                int n = r.nextInt(v.size());
                String w = v.get(n).getMean();
                boolean overlap = false;

                for (int j = 0; j < list.size(); j++) {
                    if (w.equals(list.get(j))) {
                        overlap = true;
                        break;
                    }
                }
                if (!overlap) list.add(w);
                else i--;
            }
            Collections.shuffle(list);

            for (int i = 0; i < 4; i++) {
                System.out.print("(" + (i+1) + ")" + list.get(i) + " ");
            }
            System.out.print(">> ");
            int num = sc.nextInt();
            if (num == -1) return;
            else if (num <= 0 || num >= 5) {
                System.out.println("1번부터 4번 중에 골라주세요.");
                continue;
            }

            if (list.get(num-1).equals(v.get(idx).getMean())) System.out.println("Excellent!!");
            else System.out.println("No.");
        }
    }

    static void finish() {
        System.out.println("\"명품영어\"를 종료합니다.");
        System.exit(0);
    }

    static void run() {
        sc = new Scanner(System.in);
        System.out.println("**** 영어 단어 테스트 프로그램 \"명품영어\" 입니다. ****");

        while (true) {
            System.out.print("단어 테스트:1, 단어 삽입:2, 종료:3 >> ");
            int num = sc.nextInt();
            switch (num) {
                case 1: play(); break;
                case 2: insert(); break;
                case 3: finish(); break;
                default: System.out.println("다시 입력해주세요.");
            }
        }
    }

    public static void main(String[] args) {
        ready();
        run();
    }
}
