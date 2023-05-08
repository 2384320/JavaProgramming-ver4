import java.util.Random;

public class Practice10 {
    public static void main(String[] args) {
        Random r = new Random();
        int[][] arr = new int[4][4];
        int[] randomArr = new int[6];
        int idx = 0;

        for (int i = 0; i < 6; i++) {
            randomArr[i] = r.nextInt(16);
            for (int j = 0; j < i; j++) {
                if (randomArr[i] == randomArr[j]) {
                    i--;
                    break;
                }
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = r.nextInt(10) + 1;
                for (int k = 0; k < 6; k++) {
                    if (idx == randomArr[k]) {
                        arr[i][j] = 0;
                        break;
                    }
                }
                idx++;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
