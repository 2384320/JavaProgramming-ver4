import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Practice10 {
    public static void main(String[] args) {
        String folderUrl = "C:\\Users\\**\\Desktop\\test\\";
        String fileName = "tel.txt";
        HashMap<String, String> hm = new HashMap<>();
        Scanner sc;

        try {
            sc = new Scanner(new FileReader(folderUrl + fileName));

            String[] strArr;
            while (sc.hasNext()) {
                strArr = sc.nextLine().split(" ");
                hm.put(strArr[0], strArr[1]);
            }
            sc.close();
        } catch (IOException e) {
            System.out.println("입출력 오류");
        }

        sc = new Scanner(System.in);
        System.out.println("총 " + hm.size() + "개의 전화번호를 읽었습니다.");

        while (true) {
            System.out.print("이름 >> ");
            String name = sc.nextLine();
            if (name.equals("그만")) break;

            String tel;
            tel = hm.getOrDefault(name, "찾는 이름이 없습니다.");
            System.out.println(tel);
        }
        sc.close();
    }
}
