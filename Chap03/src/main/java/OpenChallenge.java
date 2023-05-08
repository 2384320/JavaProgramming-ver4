import java.util.Random;
import java.util.Scanner;

public class OpenChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        String replay = "y";

        while (!replay.equals("n")) {
            int min = 0, max = 99, round = 1;
            int randomNum = r.nextInt(100);

            System.out.println("수를 결정하였습니다. 맞추어 보세요");
            System.out.println(min + "-" + max);
            System.out.print(round + ">>");

            int num = sc.nextInt();

            while (randomNum != num) {
                if (randomNum > num) {
                    System.out.println("더 높게");
                    min = num;
                } else {
                    System.out.println("더 작게");
                    max = num;
                }
                round++;

                System.out.println(min + "-" + max);
                System.out.print(round + ">>");
                num = sc.nextInt();
            }
            System.out.println("맞았습니다.");
            System.out.print("다시하시겠습니까(y/n)>>");
            replay = sc.next();
        }
        sc.close();
    }
}