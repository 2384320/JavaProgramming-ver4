import java.util.HashMap;
import java.util.Scanner;

public class Practice07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Double> hm = new HashMap<>();
        System.out.println("미래장학금 관리 시스템입니다.");

        for (int i = 0; i < 5; i++) {
            System.out.print("이름과 학점 >> ");
            String name = sc.next();
            double score = sc.nextDouble();
            hm.put(name, score);
        }

        System.out.print("장학생 선말 학점 기준 입력 >> ");
        double cutLine = sc.nextDouble();
        StringBuilder sb = new StringBuilder();

        for (String name : hm.keySet()) {
            if (hm.get(name) >= cutLine) sb.append(name + " ");
        }

        System.out.println("장학생 명당: " + sb);
        sc.close();
    }
}
