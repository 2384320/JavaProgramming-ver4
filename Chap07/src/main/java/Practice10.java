import java.util.Scanner;
import java.util.Vector;

class Line extends Shape {
    @Override
    public void draw() {
        System.out.println("Line");
    }
}

class Rect extends Shape {
    @Override
    public void draw() {
        System.out.println("Rect");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Circle");
    }
}

public class Practice10 {
    static Scanner sc;
    static Vector<Shape> v;

    static void insert() {
        Shape s = null;
        sc = new Scanner(System.in);
        while (true) {
            System.out.print("Line(1), Rect(2), Circle(3) >> ");
            int command = sc.nextInt();
            switch (command) {
                case 1: s = new Line(); break;
                case 2: s = new Rect(); break;
                case 3: s = new Circle(); break;
                default: System.out.println("다시 입력하세요.");
            }
            v.add(s);
            break;
        }
    }

    static void delete() {
        sc = new Scanner(System.in);
        System.out.print("삭제할 도형의 위치 >> ");
        int location = sc.nextInt();

        if (location > v.size()) System.out.println("삭제할 수 없습니다.");
        else v.remove(location-1);
    }

    static void select() {
        for (int i = 0; i < v.size(); i++) {
            v.get(i).draw();
        }
    }

    static void finish() {
        System.exit(0);
    }
    static void run() {
        System.out.println("그래픽 에디터 beauty를 실행합니다.");
        sc = new Scanner(System.in);
        v = new Vector<>();

        while (true) {
            System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4) >> ");
            int command = sc.nextInt();
            switch (command) {
                case 1: insert(); break;
                case 2: delete(); break;
                case 3: select(); break;
                case 4: finish(); break;
                default: System.out.println("다시 입력해주세요.");
            }
        }
    }

    public static void main(String[] args) {
        run();
    }
}
