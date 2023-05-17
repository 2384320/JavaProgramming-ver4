public class Circle {
    private int x, y, radius;

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public String toString() {
        return "Circle(" + x + ", " + y + ") 반지름 " + radius;
    }

    public boolean equals(Circle circle) {
        if (this.x == circle.x && this.y == circle.y) return true;
        else return false;
    }
}
