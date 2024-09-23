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

    @Override
    public boolean equals(Object obj) {
        //Snelle check
        if (this == obj){
            return true;
        }
        // NULL check en datatype
        if ((obj==null) || (!(obj instanceof Point))){
            return false;
        }
        //Casten
        Point that = (Point)obj;
        return (this.x == that.x) && (this.y == that.y);
    }
}
