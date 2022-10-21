package Lab_Tasks.Lab_4.Part_2.Task_1;


public class Rectangle {
    private double length;
    private double width;

    public Rectangle(Rectangle obj) {
        this(obj.length, obj.width);
    }

    public Rectangle() {
        this(0, 0);
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }
    
    public void setLength(double length) {
        if (length >= 0)
            this.length = length;
    }
    
    public double getWidth() {
        return width;
    }
    
    public void setWidth(double width) {
        if (width >= 0)
            this.width = width;
    }

    public double calculateArea(){
        return length * width; 
    }

    public boolean checkSquare(){
        if (Double.doubleToLongBits(length) == 0 && Double.doubleToLongBits(width) == 0) 
            return true;
        return false;
    }

    public int compare(Rectangle obj){
        if (this.calculateArea() > obj.calculateArea())
            return 1;
        if (this.calculateArea() < obj.calculateArea())
            return -1;
        return 0;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) 
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Rectangle other = (Rectangle) obj;
        if (Double.doubleToLongBits(this.length) != Double.doubleToLongBits(other.width))
            return false;
        if (Double.doubleToLongBits(this.length) != Double.doubleToLongBits(other.width))
            return false;
        return true;
    }

    @Override
    public String toString(){
        return "Rectangle [Length: " + length + ", " + "Width: " + width + "]";
    }
    
}
