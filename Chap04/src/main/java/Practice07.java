import java.util.Scanner;

class Day {
    private String work;
    public void set(String work) {
        this.work = work;
    }
    public String get() {
        return work;
    }
    public void show() {
        if (work == null) System.out.println("없습니다.");
        else System.out.println(work + "입니다.");
    }
}

public class Practice07 {
    private Scanner sc = new Scanner(System.in);
    private Day[] days;

    public Practice07(int day) {
        this.days = new Day[day];
        for (int i = 0; i < days.length; i++) {
            days[i] = new Day();
        }
    }

    void input() {
        System.out.print("날짜(1~30)>>");
        int day = sc.nextInt();
        if (day <= 0 || day > days.length) {
            System.out.println("날짜를 잘못 입력하였습니다.");
            return;
        }
        day--;
        System.out.print("할일(빈칸없이입력)>>");
        String work = sc.next();
        days[day].set(work);
    }

    void view() {
        System.out.print("날짜(1~30)>>");
        int day = sc.nextInt();
        if (day <= 0 || day > days.length) {
            System.out.println("날짜를 잘못 입력하였습니다.");
            return;
        }
        day--;
        System.out.print((day+1) + "일의 할 일은 ");
        days[day].show();
    }

    void finish() {
        System.out.println("프로그램을 종료합니다.");
        System.exit(0);
    }
    void run() {
        System.out.println("이번달 스케줄 관리 프로그램.");

        while (true) {
            System.out.print("할일(입력:1, 보기:2, 끝내기:3>>");
            int command = sc.nextInt();

            if (command == 1) input();
            else if (command == 2) view();
            else if (command == 3) finish();
            else System.out.println("잘못된 입력입니다.");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Practice07 april = new Practice07(30);
        april.run();
    }
}
