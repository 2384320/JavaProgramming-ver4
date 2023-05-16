class Point4 {
    private int x, y;
    public Point4(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    protected void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class PositivePoint extends Point4 {

    public PositivePoint() {
        super(0, 0);
    }
    public PositivePoint(int x, int y) {
        super(x, y);
        if (x < 0 || y < 0) super.move(0, 0);
    }

    @Override
    public void move(int x, int y) {
        if (x > 0 && y > 0) super.move(x, y);
    }

    public String toString() {
        return "(" + getX() + ", " + getY() + ")의 점";
    }
}

public class Practice08 {
    public static void main(String[] args) {
        PositivePoint p = new PositivePoint();
        p.move(10, 10);
        System.out.println(p.toString() + "입니다.");

        p.move(-5, 5);
        System.out.println(p.toString() + "입니다.");

        PositivePoint p2 = new PositivePoint(-10, -10);
        System.out.println(p2.toString() + "입니다.");
    }
}
