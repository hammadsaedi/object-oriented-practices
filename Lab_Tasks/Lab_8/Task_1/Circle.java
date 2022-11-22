package Lab_Tasks.Lab_8.Task_1;

public class Circle implements Shapes {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double circumference(){
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle [Radius: " + radius + "]";
    }
}
