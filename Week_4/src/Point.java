public class Point {
    //FIELDS
    private int x;
    private int y;

    //CONSTRUCTORS

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //METHODS

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
    //De methoden moveX(int dx), moveY(int dy) en moveXY(int dx, int dy) wijzigen het coördinaat
    //als gevolg van verplaatsing
    public void moveX(int dx){
       this.x += dx;
    }

    public void moveY(int dy){
        this.y += dy;
    }

    public void moveXY(int dx, int dy){
        this.x += dx;
        this.y += dy;
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", x, y);
    }
}
