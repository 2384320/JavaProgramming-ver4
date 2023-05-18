import java.util.Scanner;

public class OpenChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        System.out.println("영문 텍스트를 입력하고 세미콜론을 입력하세요.");
        while (true) {
            String line = sc.nextLine();
            if (line.equals(";")) break;
            sb.append(line);
        }

        String str = new String(sb).toLowerCase();
        int[] arr = new int[26];

        for (char ch : str.toCharArray()) {
            if (ch-'a' >= 0 && ch-'a' < 26) arr[ch-'a']++;
        }

        System.out.println("히스토그램을 그립니다.");
        for (int i = 0; i < 26; i++) {
            System.out.print((char)('A'+i));
            for (int j = 0; j < arr[i]; j++) {
                System.out.print("-");
            }
            System.out.println();
        }
        sc.close();
    }
}
