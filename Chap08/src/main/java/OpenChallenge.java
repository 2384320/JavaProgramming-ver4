import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class OpenChallenge {
    static Vector<String> v;
    static Scanner sc;

    private static void setting() {
        v = new Vector();

        String fileUrl = "C:\\Users\\**\\Desktop\\test\\words.txt";
        try {
            sc = new Scanner(new FileReader(fileUrl));
            String word;
            while (sc.hasNext()) {
                word = sc.nextLine();
                v.add(word);
            }
            sc.close();
        } catch (IOException e) {
            System.out.println("입출력 오류");
        }
    }

    private static void run() {
        sc = new Scanner(System.in);
        System.out.println("지금부터 행맨 게임을 시작합니다.");

        while (true) {
            String[] quiz = selectWord();
            boolean win = false;

            for (int i = 0; i < 5; i++) {
                System.out.println(quiz[1]);
                System.out.print(">> ");
                String s = sc.nextLine();
                if (quiz[2].equals(s)) {
                    int idx = Integer.parseInt(quiz[4]);
                    quiz[1] = quiz[1].substring(0, idx) + quiz[2] + quiz[1].substring(idx+1);
                }
                if (quiz[3].equals(s)) {
                    int idx = Integer.parseInt(quiz[5]);
                    quiz[1] = quiz[1].substring(0, idx) + quiz[3] + quiz[1].substring(idx+1);
                }
                if (!quiz[1].contains("-")) {
                    win = true;
                    break;
                }
            }

            if (!win) System.out.println("5번 실패 하였습니다.");
            System.out.println(quiz[0]);
            System.out.print("Next(y/n)?");
            String replay = sc.nextLine();
            if (replay.equals("n")) finish();
        }
    }

    private static String[] selectWord() {
        Random r = new Random();
        String[] q = new String[6];

        int wordIdx = r.nextInt(v.size());
        q[0] = v.get(wordIdx);

        int length = q[0].length();
        int idx1 = r.nextInt(length);
        int idx2 = 0;

        while (true) {
            idx2 = r.nextInt(length);
            if (idx1 != idx2) break;
        }

        if (idx1 > idx2) {
            int tmp = idx1;
            idx1 = idx2;
            idx2 = tmp;
        }
        q[1] = q[0].substring(0, idx1) + "-" + q[0].substring(idx1+1, idx2) + "-";
        if (q[0].length() != idx2 - 1) q[1] += q[0].substring(idx2+1);
        q[2] = String.valueOf(q[0].charAt(idx1));
        q[3] = String.valueOf(q[0].charAt(idx2));
        q[4] = Integer.toString(idx1);
        q[5] = Integer.toString(idx2);

        System.out.println(Arrays.toString(q));
        return q;
    }

    private static void finish() {
        System.exit(0);
    }

    public static void main(String[] args) {
        // 벡터에 모든 단어 읽히게 하기
        setting();
        // 게임 실행
        run();
    }
}
