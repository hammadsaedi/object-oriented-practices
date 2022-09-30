package Lab_2.Task_2;

public class Quadratic {
    private double a;
    private double b; 
    private double c;

    /**
     * Instantiate Quadratic Equation with a = 0
     */
    public Quadratic() {
        this.a = 1;
    }

    /**
     * Instantiate Quadratic Equation with values passed
     * @param a can never be zero for quadratic equation; If passed, will be replaced with 1
     * @param b
     * @param c
     */
    public Quadratic(double a, double b, double c) {
        this();
        if (a != 0) this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * @return Disc of this equation
     */
    public double getDisc() {
        return Math.pow(b, 2) - 4*a*c;
    }

    /**
     * @return true if Disc is greater than 100
     */
    public boolean isDiscGreaterThan100(){
        return getDisc() > 100;
    }

    /**
     * @return a
     */
    public double getA() {
        return a;
    }

    /**
     * @param a can never be zero for quadratic equation; If passed, will same
     */
    public void setA(double a) {
        if (a != 0){
            this.a = a;
        }
    }

    /**
     * @return b
     */
    public double getB() {
        return b;
    }

    /**
     * @param b
     */
    public void setB(double b) {
        this.b = b;
    }

    /**
     * @return c
     */
    public double getC() {
        return c;
    }

    /**
     * @param c
     */
    public void setC(double c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return a + "x^2 " + b + "x " + c;
    } 
}
