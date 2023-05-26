import java.util.*;
import java.io.*;

public class Practice04 {
    public static void main(String[] args) {
        Scanner sc;
        String fileName = "C:\\Users\\**\\Desktop\\test3.txt";
        System.out.println(fileName + " 파일을 읽어 출력합니다.");

        try {
            sc = new Scanner(new FileReader(fileName));

            int idx = 1;
            while (sc.hasNext()) {
                String line = sc.nextLine();
                System.out.printf("%4d", idx++);
                System.out.println(": " + line);
            }
            sc.close();
        } catch (IOException e) {
            System.out.println("입출력 오류");
        }
    }
}
