import java.util.ArrayList;
import java.util.Scanner;

public class Practice02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>> ");
        ArrayList<Character> al = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String str = sc.next();
            al.add(str.charAt(0));
        }

        double sum = 0.0;
        for (int i = 0; i < 6; i++) {
            switch (al.get(i)) {
                case 'A': sum += 4.0; break;
                case 'B': sum += 3.0; break;
                case 'C': sum += 2.0; break;
                case 'D': sum += 1.0; break;
                case 'F': sum += 0.0; break;
            }
        }
        double avg = sum/6;
        System.out.print(avg);
        sc.close();
    }
}
