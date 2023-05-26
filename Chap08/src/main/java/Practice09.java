import java.io.File;

public class Practice09 {
    public static void main(String[] args) {
        String folderUrl = "C:\\Users\\**\\Desktop\\test\\";
        String fileType = ".txt";
        File file = new File(folderUrl);
        System.out.println(folderUrl + " 디렉터리의 " + fileType + " 파일을 모두 삭제합니다...");

        File[] fileList = file.listFiles();

        for (int i = 0; i < fileList.length; i++) {
            if (fileList[i].getName().lastIndexOf(fileType) != -1) {
                System.out.println(fileList[i].getPath() + " 삭제");
                fileList[i].delete();
            }
        }
    }
}
