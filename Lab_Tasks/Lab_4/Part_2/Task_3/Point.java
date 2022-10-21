package Lab_Tasks.Lab_4.Part_2.Task_3;

public class Point {
    private double x;
    private double y;

    public Point(){}
    
    public Point(double x) {
        this.x = x;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point obj){
        this(obj.getX(), obj.getY());
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

    public boolean checkOrigin(){
        return x == 0 && y == 0;
    }

    public void move(double x, double y){
        this.x += x;
        this.y += y;
    }

    public Point addTwoPoints(Point point){
        return new Point(this.x + point.x, this.y + point.y);
    }

    public Point addThreePoints(Point p1, Point p2){
        return new Point(p1.x + addTwoPoints(p2).x, p1.y + addTwoPoints(p2).y);
    }

    @Override
    public String toString() {
        return "Point ("+ x + "," + y + ")";
    }    
}
