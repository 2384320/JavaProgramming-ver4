import java.util.*;

public class OpenChallenge {
    static Vector<Word> v;
    static void insert() {
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

    static void run() {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("\"명품영어\"의 단어 테스트를 시작합니다. -1을 입력하면 종료합니다.");
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
            if (num == -1) {
                System.out.println("\"명품영어\"를 종료합니다..");
                break;
            }
            else if (num <= 0 || num >= 5) {
                System.out.println("1번부터 4번 중에 골라주세요.");
                continue;
            }

            if (list.get(num-1).equals(v.get(idx).getMean())) System.out.println("Excellent!!");
            else System.out.println("No.");
        }
    }

    public static void main(String[] args) {
        insert();
        run();
    }
}
