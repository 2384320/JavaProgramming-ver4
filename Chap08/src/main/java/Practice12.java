import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

public class Practice12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
        System.out.print("대상 파일명 입력 >> ");
        String fileName = sc.nextLine();
        String folderUrl = "C:\\Users\\**\\Desktop\\test\\";
        Vector<String> v = new Vector<>();

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
            System.out.print("검색할 단어나 문장 >> ");
            String search = sc.nextLine();
            if (search.equals("그만")) break;

            for (int i = 0; i < v.size(); i++) {
                if (v.get(i).contains(search)) System.out.println(v.get(i));
            }
        }
        System.out.println("프로그램을 종료합니다.");
        sc.close();
    }
}
