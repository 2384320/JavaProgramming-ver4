import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Practice14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("***** 파일 탐색기입니다. *****");
        String folderUrl = "C:";
        boolean rewriteCommand = false;

        while (true) {
            if (!rewriteCommand) {
                System.out.println("\t[" + folderUrl + "\\]");
                File file = new File(folderUrl + "\\");
                File[] fileList = file.listFiles();
                for (int i = 0; i < fileList.length; i++) {
                    String fileOrDirectory = "dir ";
                    if (fileList[i].isFile()) fileOrDirectory = "file";
                    System.out.println(fileOrDirectory + "\t" + fileList.length + "바이트\t"
                            + fileList[i].getName());
                }
            }

            System.out.print(">> ");
            String nextUrl = sc.next();
            if (nextUrl.equals("그만")) break;
            else if (nextUrl.equals("..")) {
                int slashIdx = folderUrl.lastIndexOf("\\");
                folderUrl = folderUrl.substring(0, slashIdx);
            } else if (nextUrl.equals("mkdir")) {
                String mkdirDir = sc.next();
                File mkdirFile = new File(folderUrl + mkdirDir);
                mkdirFile.mkdir();
                System.out.println(mkdirDir + " 디렉터리를 생성하였습니다.");
            } else if (nextUrl.equals("rename")) {
                String[] name = sc.nextLine().trim().split(" ");
                if (name.length != 2) {
                    System.out.println("두 개의 파일명이 주어지지 않았습니다!");
                    rewriteCommand = true;
                    continue;
                }
                File currentFile = new File(folderUrl + name[0]);
                File renameFile = new File(folderUrl + name[1]);
                currentFile.renameTo(renameFile);
                System.out.println(name[0] + "을(를) " + name[1] + " 이름으로 변경하였습니다.");
            } else folderUrl += "\\" + nextUrl;
            rewriteCommand = false;
        }
        sc.close();
    }
}

