public class MyPoint {
    private int x, y;

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean equals(MyPoint myPoint) {
        if (this.x == myPoint.x && this.y == myPoint.y) return true;
        else return false;
    }

    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }
}
