package Lab_3.Task_1;

public class Rectangle {
    private double length;
    private double width;
    
    /**
     * Instantiate Rectangle
     * @param length
     * @param width
     * @throws RuntimeException if @param length or @param width is negative
     */
    public Rectangle(double length, double width) {
        if (length < 0 || width < 0) throw new RuntimeException("Length or Width can never b Negative.");
        this.length = length;
        this.width = width;
    }

    /**
     * Instantiate Unit Rectangle
     * where length = width = 1
     */
    public Rectangle() {
        this(1, 1);
    }
    
    /**
     * Calculate area of rectangle
     * @return area of this rectangle
     */
    public double area(){
        return length * width;
    }

    /**
     * Compares two Rectangles
     * @param obj
     * @return -1 || 0 || 1
     * <li>0 if both are same</li> 
     * <li>1 if this rectangle is greater</li>
     * <li>-1 if this rectangle is smaller</li>
     */
    public int compare(Rectangle obj){
        return (Double.doubleToLongBits(this.area()) == Double.doubleToLongBits(obj.area()))?0:(Double.doubleToLongBits(this.area()) > Double.doubleToLongBits(obj.area()))?1:-1;
    }

    /**
     * Get Length of this rectangle
     * @return length
     */
    public double getLength() {
        return length;
    }

    /**
     * Set Length of this Rectangle
     * @param length
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Get Width of this rectangle
     * @return width
     */
    public double getWidth() {
        return width;
    }

    /**
     * Set Width of this rectangle
     * @param width
     */
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
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
    public String toString() {
        return "Rectangle [Length: " + length + ", Width: " + width + "]";
    }
}
