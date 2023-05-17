import java.util.Scanner;
import java.util.StringTokenizer;

public class Practice07_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print(">>");
            String str = sc.nextLine();
            if (str.equals("그만")) {
                System.out.println("<종료합니다>");
                break;
            }
            StringTokenizer st = new StringTokenizer(str, " ");

            System.out.println("어절 개수는 " + st.countTokens());
        }
    }
}
