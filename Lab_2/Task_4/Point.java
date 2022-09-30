package Lab_2.Task_4;

public class Point {
    private double x;
    private double y;

    /**
     * Instantiate Point at given params
     * @param x
     * @param y
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Instantiate Point at Origin
     */
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    /**
     * Move x & y to 1 point (both)
     */
    public void move(){
        move(1,1);
    }

    /**
     * Move x by given param
     * @param x
     */
    public void move(double x){
        move(x, 0);
    }

    /**
     * Move points by given params
     * @param x
     * @param y
     */
    public void move(double x, double y){
        this.x += x;
        this.y += y;
    }

    /**
     * @return true if Point is at origin
     */
    public boolean checkOrigin(){
        return x == 0 && y == 0;
    }

    /**
     * @return x
     */
    public double getX() {
        return x;
    }

    /**
     * @param x
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * @return y
     */
    public double getY() {
        return y;
    }

    /**
     * @param y
     */
    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point (" + x + ", "  + y + ")";
    }   
}
