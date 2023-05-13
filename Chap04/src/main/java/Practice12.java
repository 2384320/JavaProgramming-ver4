import java.util.Arrays;
import java.util.Scanner;

class Seat {
    private String name;
    private String[] line;

    public Seat(String name, int line) {
        this.name = name;
        this.line = new String[line];

        for (int i = 0; i < line; i++) {
            this.line[i] = "---";
        }
    }

    public void printLine() {
        System.out.print(name + ">>");
        for (int i = 0; i < line.length; i++) {
            System.out.print(" " + line[i]);
        }
        System.out.println();
    }

    public void reserve(String name, int num) {
        line[num-1] = name;
    }

    public boolean existName(String peopleName) {
        for (int i = 0; i < line.length; i++) {
            if (line[i].equals(peopleName)) return true;
        }
        return false;
    }

    public void delete(String peopleName) {
        for (int i = 0; i < line.length; i++) {
            if (line[i].equals(peopleName)) line[i] = "---";
        }
    }
}

public class Practice12 {
    static int idx;
    static Seat[] seat;
    static Scanner sc;
    static void run() {
        while (true) {
            System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
            int command = sc.nextInt();

            switch (command) {
                case 1: reserve(); break;
                case 2: search(); break;
                case 3: delete(); break;
                case 4: finish(); break;
                default: System.out.println("올바른 메뉴를 선택해주세요."); break;
            }
        }

    }

    static void reserve() {
        while (true) {
            System.out.print("[좌석구분] S:1, A:2, B:3>>");
            int seatNum = sc.nextInt();
            if (seatNum > 3 || seatNum < 1) {
                System.out.println("<<<좌석 번호를 올바르게 입력해주세요.>>>");
                continue;
            }

            seat[seatNum-1].printLine();

            System.out.print("이름>>");
            String name = sc.next();
            System.out.print("번호>>");
            int num = sc.nextInt();
            seat[seatNum-1].reserve(name, num);
            break;
        }
        System.out.println("<<<예약을 완료하였습니다.>>>");
    }

    static void search() {
        for (int i = 0; i < 3; i++) {
            seat[i].printLine();
        }
        System.out.println("<<<조회를 완료하였습니다.>>>");
    }

    static void delete() {
        while (true) {
            System.out.print("[좌석구분] S:1, A:2, B:3>>");
            int seatNum = sc.nextInt();
            if (seatNum > 3 || seatNum < 1) {
                System.out.println("<<<좌석 번호를 올바르게 입력해주세요.>>>");
                continue;
            }

            seat[seatNum-1].printLine();
            System.out.print("이름>>");
            String name = sc.next();
            if (seat[seatNum-1].existName(name)) seat[seatNum-1].delete(name);
            else {
                System.out.println("<<<해당 라인에서 " + name + "님에 대한 예약 정보를 확인할 수 없습니다.>>>");
                continue;
            }
            break;
        }
        System.out.println("<<<취소를 완료하였습니다.>>>");
    }

    static void finish() {
        System.out.println("<<<예약 시스템이 종료됩니다.>>>");
        System.exit(0);
    }

    public static void main(String[] args) {
        System.out.println("명품콘스터홀 예약 시스템입니다.");
        idx = 0;
        seat = new Seat[3];
        String[] name = new String[] {"S", "A", "B"};

        for (int i = 0; i < 3; i++) {
            seat[i] = new Seat(name[i], 10);
        }

        sc = new Scanner(System.in);
        run();
    }
}
