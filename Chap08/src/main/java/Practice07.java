import java.io.*;

public class Practice07 {
    public static void main(String[] args) {
        String fileUrl = "C:\\Users\\**\\Desktop\\";
        String original = "test.jpg";
        String copy = "test1.jpg";
        System.out.println(original + "를 " + copy + "로 복사합니다.");
        System.out.println("10%마다 *를 출력합니다.");

        File src = new File(fileUrl + original);
        File dest = new File(fileUrl + copy);

        int c;
        long length, cnt = 0L;
        try {
            FileInputStream fi = new FileInputStream(src);
            FileOutputStream fo = new FileOutputStream(dest);

            length = src.length() / 10;
            while ((c = fi.read()) != -1) {
                fo.write((byte)c);
                cnt++;
                if (length <= cnt) {
                    System.out.print("*");
                    cnt = 0L;
                }
            }
            fi.close();
            fo.close();
        } catch (IOException e) {
            System.out.println("입출력 오류");
        }
    }
}
