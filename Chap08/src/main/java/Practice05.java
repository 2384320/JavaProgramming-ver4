import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Practice05 {
    public static boolean compare(FileInputStream f1, FileInputStream f2) throws IOException {

        byte[] arr1 = new byte[1024];
        byte[] arr2 = new byte[1024];

        while (true) {
            int l1 = f1.read(arr1, 0, arr1.length);
            int l2 = f2.read(arr2, 0, arr2.length);

            if (l1 != l2) return false;
            if (l1 == -1) break;
            for (int i = 0; i < l1; i++) {
                if (arr1[i] != arr2[i]) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fileUrl = "C:\\Users\\**\\Desktop\\";
        System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");

        System.out.print("첫번째 파일 이름을 입력하세요 >> ");
        String file1 = sc.nextLine();
        System.out.print("두번째 파일 이름을 입력하세요 >> ");
        String file2 = sc.nextLine();

        System.out.println(file1 + "와 " + file2 + "를 비교합니다.");

        try {
            FileInputStream f1 = new FileInputStream(fileUrl+file1);
            FileInputStream f2 = new FileInputStream(fileUrl+file2);

            if (compare(f1, f2)) System.out.println("파일이 같습니다.");
            else System.out.println("파일이 서로 다릅니다.");

            f1.close();
            f2.close();
            sc.close();
        } catch (IOException e) {
            System.out.println("입출력 오류");
        }
    }
}
