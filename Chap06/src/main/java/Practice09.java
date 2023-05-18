import java.util.Random;
import java.util.Scanner;

public class Practice09 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("철수[가위(1), 바위(2), 보(3), 끝내기(4)]>>");
            int command = sc.nextInt();
            if (command == 4) break;
            int computer = r.nextInt(3) + 1;

            System.out.println("철수(" + RSP(command) + ") : 컴퓨터(" + RSP(computer) + ")");
            System.out.println(winner(command, computer));
        }
    }

    public static String winner(int command, int computer) {
        if (command == computer) return "비겼습니다.";
        else if ((command == 1 && computer == 2) || (command == 2 && computer == 3) || (command == 3 && computer == 1)) return "컴퓨터가 이겼습니다.";
        else return "철수가 이겼습니다.";
    }

    public static String RSP(int num) {
        if (num == 1) return "가위";
        else if (num == 2) return "바위";
        else return "보";
    }
}
