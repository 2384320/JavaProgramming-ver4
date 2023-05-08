import java.util.Scanner;

public class Practice04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("소문자 알파벳 하나를 입력하시오>>");
        String str = sc.next();
        char ch = str.charAt(0);

        for (int i = ch - 'a'; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char)(j+'a'));
            }
            System.out.println();
        }
    }
}

