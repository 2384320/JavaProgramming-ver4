import java.util.Scanner;

public class Practice14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] course = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
        int[] score = {95, 88, 76, 62, 55};
        boolean printCheck = false;

        String command = "";
        System.out.print("과목 이름>>");
        command = sc.next();
        while (!command.equals("그만")) {
            for (int i = 0; i < 5; i++) {
                if (command.equals(course[i])) {
                    System.out.println(course[i] + "의 점수는 " + score[i]);
                    printCheck = true;
                    break;
                }
            }
            if (!printCheck) System.out.println("없는 과목입니다.");
            System.out.print("과목 이름>>");
            command = sc.next();
        }
    }
}
