import java.util.Scanner;

public class Practice08 {
    public static void main(String[] args) {
        System.out.println("문자열을 입력하세요. 빈칸이나 있어도 되고 영어 한글 모두 됩니다.");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            str = str.substring(1, str.length()) + str.substring(0, 1);
            System.out.println(str);
        }
        sc.close();
    }
}
