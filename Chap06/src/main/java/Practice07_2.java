import java.util.Scanner;
import java.util.StringTokenizer;

public class Practice07_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print(">>");
            String str = sc.nextLine();
            if (str.equals("그만")) {
                System.out.println("<종료합니다>");
                break;
            }
            int count = str.split(" ").length;
            System.out.println("어절 개수는 " + count);
        }
    }
}
