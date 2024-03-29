package Lab_Tasks.Lab_1.Task_7;

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
        return 2 * Math.PI * radius;
    }

    public boolean isUnitCircle() {
        return this.radius == 1.0;
    }

    @Override
    public String toString() {
        return "Circle [Radius: " + radius + " ]";
    } 
}
