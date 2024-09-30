package point;

public final class PointImmutable implements Point {

    final private int x, y;

    public PointImmutable(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public int getX() {
        return x;
    }


    public int getY() {
        return y;
    }


    public PointImmutable moveX(int dx) {
        int nx = x + dx;
        return new PointImmutable(nx, y);
    }

    public PointImmutable moveY(int dy) {
        int ny = y + dy;
        return new PointImmutable(x, ny);

    }

    public PointImmutable moveXY(int dx, int dy) {
        int nx = x + dx;
        int ny = y + dy;
        return new PointImmutable(nx, ny);
    }



    @Override
    public String toString() {
        return String.format("(%d,%d)", x, y);
    }
}
