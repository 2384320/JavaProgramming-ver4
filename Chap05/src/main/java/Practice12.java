import java.util.Scanner;

abstract class Shape {
    private Shape next;
    public Shape() { next = null; }
    public void setNext(Shape obj) { next = obj; }
    public Shape getNext() { return next; }
    public abstract void draw();
}

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

public class Practice12 {
    static Scanner sc;
    static Shape head, tail;

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
            break;
        }

        if (head == null) head = s;
        else tail.setNext(s);
        tail = s;
    }

    static void delete() {
        Shape cur = head;
        Shape tmp = head;
        sc = new Scanner(System.in);
        System.out.print("삭제할 도형의 위치 >> ");
        int location = sc.nextInt();

        if (location == 1) {
            if (head == tail) {
                head = null;
                tail = null;
            } else head = head.getNext();
            return;
        }

        for (int i = 1; i < location; i++) {
            tmp = cur;
            cur = cur.getNext();
            if (cur == null) {
                System.out.println("삭제할 수 없습니다.");
                return;
            }
        }
        tmp.setNext(cur.getNext());
    }

    static void select() {
        Shape s = head;
        while (s != null) {
            s.draw();
            s = s.getNext();
        }
    }

    static void finish() {
        System.exit(0);
    }
    static void run() {
        System.out.println("그래픽 에디터 beauty를 실행합니다.");
        sc = new Scanner(System.in);

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
