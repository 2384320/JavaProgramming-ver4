import java.util.HashMap;
import java.util.Scanner;

public class Practice08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> hm = new HashMap<>();
        System.out.println("** 포인트 관리 프로그램입니다. **");
        while (true) {
            System.out.print("이름과 포인트 입력 >> ");

            String name = sc.next();
            if (name.equals("그만")) break;
            int point = sc.nextInt();
            hm.put(name, point);

            for (String n : hm.keySet()) {
                System.out.print("(" + n + ", " + hm.get(n) + ") ");
            }
            System.out.println();
        }
        sc.close();
    }
}
