package Lab_3.Task_2;

public class Point {
    private double x;
    private double y;

    /**
     * Instantiate Point
     * @param x
     * @param y
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Instantiate Point at origin
     */
    public Point() {
        this(0, 0);
    }

    /**
     * Get x coordinate
     * @return x
     */
    public double getX() {
        return x;
    }

    /**
     * Set x coordinate
     * @param x
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * Get y coordinate
     * @return y
     */
    public double getY() {
        return y;
    }

    /**
     * Set y coordinate
     * @param y
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * Move Point up to given params 
     * @param x
     * @param y
     */
    public void move(double x, double y){
        this.x += x;
        this.y += y;
    }

    /**
     * Move point to one unit
     */
    public void move(){
        move(1,1);
    }

    @Override
    public String toString() {
        return "Point [x: " + x + ", y: " + y + "]";
    }
}
