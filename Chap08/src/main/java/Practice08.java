import java.io.File;

public class Practice08 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\**\\Desktop\\");
        File[] fileList = file.listFiles();

        long max = Integer.MIN_VALUE;
        String fileName = "";
        for (int i = 0; i < fileList.length; i++) {
            if (max < fileList[i].length()) {
                max = fileList[i].length();
                fileName = fileList[i].getName();
            }
        }
        System.out.println("가장 큰 파일은 " + fileName + " " + max + "바이트");
    }
}
