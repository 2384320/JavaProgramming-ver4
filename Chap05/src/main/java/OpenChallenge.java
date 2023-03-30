import java.util.Scanner;

abstract class GameObject {
    protected int distance;
    protected int x, y;
    public GameObject(int startX, int startY, int distance) {
        this.x = startX;
        this.y = startY;
        this.distance = distance;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public boolean collide(GameObject p) {
        if (this.x == p.getX() && this.y == p.getY()) return true;
        else return false;
    }
    protected abstract void move();
    protected abstract char getShape();
}

class Bear2 extends GameObject {
    Scanner sc = new Scanner(System.in);
    public Bear2(int x, int y, int distance) {
        super(x, y, distance);
    }

    @Override
    protected void move() {
        System.out.print("왼쪽(a), 아래(s), 위(w), 오른쪽(d) >> ");
        String command = sc.next();

        switch(command) {
            case "a":
                if (super.x > 0) super.x -= super.distance;
                break;
            case "s":
                if (super.y < 9) super.y += super.distance;
                break;
            case "w":
                if (super.y > 0) super.y -= super.distance;
                break;
            case "d":
                if (super.x < 19) super.x += super.distance;
                break;
        }
    }

    @Override
    protected char getShape() {
        return 'B';
    }
}

class Fish2 extends GameObject {
    public Fish2(int x, int y, int distance) {
        super(x, y, distance);
    }

    @Override
    protected void move() {
        int random = (int)(Math.random()*4);
        switch (random) {
            case 0:
                if (super.x > 0) super.x -= super.distance;
                break;
            case 1:
                if(super.y < 9) super.y += super.distance;
                break;
            case 2:
                if (super.y > 0) super.y -= super.distance;
                break;
            case 3:
                if (super.x < 19) super.x += super.distance;
                break;
        }
    }

    @Override
    protected char getShape() {
        return '@';
    }
}
public class OpenChallenge {
    static GameObject bear;
    static GameObject fish;

    public static void main(String[] args) {
        System.out.println("** Bear의 Fish 먹기 게임을 시작합니다. **");
        bear = new Bear2(0, 0, 1);
        fish = new Fish2((int)(Math.random() * 20), (int)(Math.random() * 10), 1);

        int[] moveFishArr = moveFish();
        int count = 0;

        drawMap();
        while (!bear.collide(fish)) {
            bear.move();
            if (moveFishArr[count] == 1) fish.move();

            count++;
            if (count == 5) {
                moveFishArr = moveFish();
                count = 0;
            }

            drawMap();
        }
        System.out.println("Bear Wins!!");
    }

    public static void drawMap() {
        int bearX = bear.getX();
        int bearY = bear.getY();
        int fishX = fish.getX();
        int fishY = fish.getY();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                if (bearX == j && bearY == i) System.out.print(bear.getShape());
                else if (fishX == j && fishY == i) System.out.print(fish.getShape());
                else System.out.print('-');
            }
            System.out.println();
        }
    }
    public static int[] moveFish() {
        int arr[] = new int[5];
        int cnt = 0;

        while (true) {
            int index = (int)(Math.random()*4);
            if (arr[index] == 0) {
                arr[index] = 1;
                cnt++;
            }
            if (cnt == 2) break;
        }
        return arr;
    }
}
