import java.io.*;
import java.util.*;

public class Practice06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fileUrl = "C:\\Users\\chdms\\Desktop\\";
        System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");

        System.out.print("첫번째 파일 이름을 입력하세요 >> ");
        String file1 = sc.nextLine();
        System.out.print("두번째 파일 이름을 입력하세요 >> ");
        String file2 = sc.nextLine();

        try {
            StringBuilder sb = new StringBuilder();
            sc = new Scanner(new FileReader(fileUrl+file1));
            while (sc.hasNext()) {
                sb.append(sc.nextLine()).append("\n");
            }
            sb.append("\n");
            sc = new Scanner(new FileReader(fileUrl+file2));
            while (sc.hasNext()) {
                sb.append(sc.nextLine()).append("\n");
            }

            FileWriter fout = new FileWriter(fileUrl+"test4.txt");
            fout.write(sb.toString(), 0, sb.length());

            System.out.print("프로젝트 폴더 밑에 test4.txt 파일에 저장하였습니다.");
            fout.close();
            sc.close();
        } catch (IOException e) {
            System.out.println("입출력 오류");
        }
    }
}
