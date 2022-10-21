package Lab_Tasks.Lab_4.Part_1.Task_1;

import java.util.Objects;

public class Point {
    private double x;
    private double y;

    public Point(){
        this(0,0);
    }

    public Point(final double x, final double y){
        this.x = x;
        this.y = y;
    }

    public void setX(final double x){
        this.x = x;
    }

    public void setY(final double y){
        this.y = y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public void move(final double x, final double y){
        this.x += x;
        this.y += y;
    }

    public double distance(Point point){
        return Math.sqrt(Math.pow((this.x - point.getX()), 2) + Math.pow((this.y - point.getY()), 2));
    }

    public int compare(Point obj){
        if (distance(new Point()) > obj.distance(new Point())) 
            return 1;
        if (distance(new Point()) < obj.distance(new Point())) 
            return -1;
        return 0;
    }
    
    @Override
    public boolean equals(Object obj){
        if (this == obj) 
            return true;
        if (Objects.isNull(obj)) 
            return false;
        if (getClass() != obj.getClass()) 
            return false;
        Point other = (Point) obj;
        if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x)) 
            return false;
        if (Double.doubleToLongBits(y) != Double.doubleToLongBits(other.y)) 
            return false;
        return true;
    }

    @Override
    public String toString(){
        return "Point ( " + x + "," + y + " )";
    }
}
