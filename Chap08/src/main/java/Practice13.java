import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Practice13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("***** 파일 탐색기입니다. *****");
        String folderUrl = "C:";

        while (true) {
            System.out.println("\t[" + folderUrl + "\\]");
            File[] fileList = new File(folderUrl + "\\").listFiles();
            for (int i = 0; i < fileList.length; i++) {
                String fileOrDirectory = "dir ";
                if (fileList[i].isFile()) fileOrDirectory = "file";
                System.out.println(fileOrDirectory + "\t" + fileList.length + "바이트\t"
                + fileList[i].getName());
            }

            System.out.print(">> ");
            String nextUrl = sc.nextLine();
            if (nextUrl.equals("그만")) break;
            else if (nextUrl.equals("..")) {
                int slashIdx = folderUrl.lastIndexOf("\\");
                folderUrl = folderUrl.substring(0, slashIdx);
            } else folderUrl += "\\" + nextUrl;
        }
        sc.close();
    }
}
