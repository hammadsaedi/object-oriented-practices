package Lab_3.Task_2;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this(0, 0);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void move(double x, double y){
        this.x += x;
        this.y += y;
    }

    public void move(){
        move(1,1);
    }

    @Override
    public String toString() {
        return "Point [x: " + x + ", y: " + y + "]";
    }
}
