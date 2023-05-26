import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

public class Practice11 {
    public static void main(String[] args) {
        String folderUrl = "C:\\Users\\**\\Desktop\\test\\";
        String fileName = "words.txt";
        Vector<String> v = new Vector<>();
        Scanner sc;

        try {
            sc = new Scanner(new FileReader(folderUrl + fileName));

            String str;
            while (sc.hasNext()) {
                str = sc.nextLine();
                v.add(str);
            }
            sc.close();
        } catch (IOException e) {
            System.out.println("입출력 오류");
        }

        sc = new Scanner(System.in);

        while (true) {
            System.out.print("단어 >> ");
            String word = sc.nextLine();
            if (word.equals("그만")) break;

            boolean exist = false;
            for (int i = 0; i < v.size(); i++) {
                if (v.get(i).indexOf(word) == 0) {
                    System.out.println(v.get(i));
                    exist = true;
                }
            }

            if (!exist) System.out.println("발견할 수 없음.");
        }
        System.out.println("종료합니다...");
        sc.close();
    }
}
