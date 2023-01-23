package Assignments.Assignment_3;

public class Rectangle extends GeometricObject {
    private double length;
    private double width;

    public Rectangle(boolean isFilled, String color, double thickness, double length, double width) {
        super(isFilled, color, thickness);
        if (length < 0 || width < 0)
            throw new RuntimeException("Length or Width can never b Negative.");
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }

    public double volume() {
        return area() * thickness;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Rectangle other = (Rectangle) obj;
        if (Double.doubleToLongBits(length) != Double.doubleToLongBits(other.length))
            return false;
        if (Double.doubleToLongBits(width) != Double.doubleToLongBits(other.width))
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
        return super.toString() + "Rectangle [Length: " + length + ", Width: " + width + "]";
    }
}
