import java.util.Calendar;
import java.util.Scanner;



public class Practice06 {
    static Person p1, p2;
    static Scanner sc;

    static int play(Person p) {
        sc = new Scanner(System.in);
        System.out.print(p.getName() + " 시작 <Enter>키 >> ");
        sc.nextLine();
        p.setTime1(enter());
        System.out.println("        현재 초 시간 = " + p.getTime1());

        System.out.print("10초 예상 후 <Enter>키 >> ");
        sc.nextLine();
        p.setTime2(enter());
        System.out.println("        현재 초 시간 = " + p.getTime2());

        return p.getAbs();
    }
    static int enter() {
        Calendar now = Calendar.getInstance();
        int sec = now.get(Calendar.SECOND);
        return sec;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        p1 = new Person("황기태");
        p2 = new Person("이재문");

        String winner = "";
        System.out.println("10초에 가까운 사람이 이기는 게임입니다.");

        int p1Time = play(p1);
        int p2Time = play(p2);

        if (p1Time > p2Time) winner = p2.getName();
        else winner = p1.getName();

        System.out.print(p1.getName() + "의 결과 " + p1Time + ", " + p2.getName() + "의 결과 " + p2Time + ", 승자는 " + winner);
    }
}
