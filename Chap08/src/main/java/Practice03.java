import java.io.*;
import java.util.*;

public class Practice03 {
    public static void main(String[] args) {
        Scanner sc;
        String fileName = "C:\\Users\\chdms\\Desktop\\test2.txt";
        try {
            sc = new Scanner(new FileReader(fileName));

            while (sc.hasNext()) {
                String line = sc.nextLine();
                System.out.println(line.toUpperCase());
            }

            sc.close();
        } catch (IOException e) {
            System.out.println("입출력 오류");
        }
    }
}
