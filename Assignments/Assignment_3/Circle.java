package Assignments.Assignment_3;

public class Circle extends GeometricObject {
    private double radius;

    public Circle(boolean isFilled, String color, double thickness, double radius) {
        super(isFilled, color, thickness);
        this.radius = radius;
    }

    public double circumference(){
        return 2 * Math.PI * radius;
    }

    public boolean isUnitCircle() {
        return this.radius == 1.0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area(){
        return Math.PI * Math.pow(radius, 2); 
    }

    public double volume(){
        return area() * thickness;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Circle other = (Circle) obj;
        if (Double.doubleToLongBits(radius) != Double.doubleToLongBits(other.radius))
            return false;
        return true;
    }

    @Override
    public int compareTo(GeometricObject obj) {
        if (volume() > obj.volume()) 
            return 1;
        if (volume() < obj.volume()) 
            return -1;
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() + " Circle [Radius: " + radius + "]";
    }
}
