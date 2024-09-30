package point;

public class PointMutable implements Point {

    private int x, y;

    public PointMutable(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void moveX(int dx) {
        x+=dx;
    }

    public void moveY(int dy) {
        y+=dy;
    }

    public void moveXY(int dx, int dy) {
        x+=dx;
        y+=dy;
    }


    @Override
    public String toString() {
        return String.format("(%d,%d)", x, y);
    }
}
