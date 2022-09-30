package Lab_2.Task_3;

public class Rectangle {
    private double l;
    private double w;
    
    /**
     * Instantiate Unit Square
     */
    public Rectangle() {
        this.l = 1;
        this.w = 1;
    }

    /**
     * Instantiate Rectangle
     * @param l 
     * @param w
     * @apiNote @param l & @param w cannot negative; If passed Math.abs() will be assigned 
     */
    public Rectangle(double l, double w) {
        this.l = Math.abs(l);
        this.w = Math.abs(w);
    }

    /**
     * @return Area of this Rectangle
     */
    public double calculateArea(){
        return this.l*this.w;
    }

    /**
     * @return true if this Rectangle is square 
     */
    public boolean checkSquare() {
        return this.l == this.w;
    }
    
    /**
     * @return l 
     */
    public double getL() {
        return this.l;
    }

    /**
     * @param l cannot negative; If passed Math.abs() will be assigned 
     */
    public void setL(double l) {
        this.l = Math.abs(l);
    }

    /**
     * @return w
     */
    public double getW() {
        return this.w;
    }

    /**
     * @param w cannot negative; If passed Math.abs() will be assigned 
     */
    public void setw(double w) {
        this.w = Math.abs(w);
    }

    @Override
    public String toString() {
        return "Rectangle [l: " + l + ", w: " + w + "]";
    } 
}
