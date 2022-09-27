package Task_7;

public class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double circumference(){
        return 2 * Math.PI * Math.pow(this.radius, 2);
    }

    public boolean isUnitCircle() {
        return this.radius == 1.0;
    }

    @Override
    public String toString() {
        return "Circle [Radius: " + radius + " ]";
    } 
}
