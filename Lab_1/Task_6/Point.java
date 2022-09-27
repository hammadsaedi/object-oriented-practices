package Task_6;

public class Point {
    private double x;
    private double y;
    
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
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

    /**
     * Distance of this point from given point
     * @return Distance from given point
    */
    public double distance(Point point){
        return Math.sqrt( 
            Math.pow((this.x - point.getX()), 2) + Math.pow((this.y - point.getY()), 2));
    }

    /**
     * Distance of this point from Origin
     * @return Distance from Origin
    */
    public double distance(){
        return distance(new Point(0, 0));
    }

    @Override
    public String toString() {
        return "Point ("+ x + "," + y + ")";
    }    
    

}
