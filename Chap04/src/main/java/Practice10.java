import java.util.Scanner;

class Dictionary {
    private static String[] kor = {"사랑", "아기", "돈", "미래", "희망"};
    private static String[] eng = {"love", "baby", "money", "future", "hope"};
    public static String kor2Eng(String word) {
        for (int i = 0; i < kor.length; i++) {
            if (kor[i].equals(word)) return word + "은(는) " + eng[i];
        }
        return word + "은(는) 저의 사전에 없습니다.";
    }
}
public class Practice10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("한영 단어 검색 프로그램입니다.");

        while (true) {
            System.out.print("한글 단어?");
            String word = sc.next();
            if (word.equals("그만")) break;
            System.out.println(Dictionary.kor2Eng(word));
        }
    }
}