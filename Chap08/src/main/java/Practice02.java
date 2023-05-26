import java.io.*;

public class Practice02 {
    public static void main(String[] args) {
        FileReader fin;
        String fileName = "C:\\Users\\**\\Desktop\\test.txt";
        System.out.println(fileName + "을 출력합니다.");

        try {
            fin = new FileReader(fileName);

            int c;
            while ((c = fin.read()) != -1) {
                System.out.print((char)c);
            }
            fin.close();
        } catch (IOException e) {
            System.out.println("입출력 오류");
        }
    }
}
