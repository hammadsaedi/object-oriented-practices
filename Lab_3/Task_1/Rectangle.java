package Lab_3.Task_1;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        if (length < 0 || width < 0) throw new RuntimeException("Length or Width can never b Negative.");
        this.length = length;
        this.width = width;
    }

    public Rectangle() {
        this(1, 1);
    }
    
    public double area(){
        return length * width;
    }

    public int compare(Rectangle obj){
        return (this.area() == obj.area())?0:(this.area() > obj.area())?1:-1;
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
    public String toString() {
        return "Rectangle [Length: " + length + ", Width: " + width + "]";
    }
}
