package Lab_Tasks.Lab_8.Task_1;

public class Rectangle implements Shapes {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
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
    public double area() {
        return length * width;
    }
    
    public double parameter(){
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Rectangle [Length: " + length + ", Width: " + width + "]";
    }
}
