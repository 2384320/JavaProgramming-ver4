import java.util.Scanner;

public class Practice16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = {"가위", "바위", "보"};
        String command = "";
        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
        System.out.print("가위 바위 보!>>");
        command = sc.next();
        while (!command.equals("그만")) {
            int idx = (int)(Math.random()*3);
            String winner = "";
            if (command.equals("가위")) {
                if (str[idx].equals("가위")) winner = "";
                else if (str[idx].equals("바위")) winner = "컴퓨터";
                else winner = "사용자";
            } else if (command.equals("바위")) {
                if (str[idx].equals("가위")) winner = "사용자";
                else if (str[idx].equals("바위")) winner = "";
                else winner = "컴퓨터";
            } else {
                if (str[idx].equals("가위")) winner = "컴퓨터";
                else if (str[idx].equals("바위")) winner = "사용자";
                else winner = "";
            }

            System.out.print("사용자 = " + command + ", 컴퓨터 = " + str[idx] + ", ");
            if (winner.equals("")) System.out.println("비겼습니다.");
            else System.out.println(winner + "가 이겼습니다.");

            System.out.print("가위 바위 보!>>");
            command = sc.next();
        }
    }
}
