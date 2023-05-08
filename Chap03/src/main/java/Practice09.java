import java.util.Random;

public class Practice09 {
    public static void main(String[] args) {
        Random r = new Random();
        int[][] arr = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = r.nextInt(10) + 1;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
