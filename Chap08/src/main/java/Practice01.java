import java.io.*;
import java.util.*;

public class Practice01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FileWriter fout;
        String fileName = "C:\\Users\\**\\Desktop\\test.txt";
        System.out.println("전화번호 입력 프로그램입니다.");

        try {
            fout = new FileWriter(fileName);

            while (true) {
                System.out.print("이름 전화번호 >> ");
                String name = sc.next();
                if (name.equals("그만")) break;
                String tel = sc.next();

                fout.write(name, 0, name.length());
                fout.write("\t", 0, 1);
                fout.write(tel, 0, tel.length());
                fout.write("\n", 0, 1);
            }
            fout.close();
            System.out.println(fileName + "에 저장하였습니다.");
        } catch (IOException e) {
            System.out.println("입출력 오류");
        }
        sc.close();
    }
}