package Lab_Tasks.Lab_7.Task_4;

public abstract class Conversion {
    private double original;
    private double converted;

    public Conversion(double original, double converted) {
        this.original = original;
        this.converted = converted;
    }

    public double getOriginal() {
        return original;
    }

    public void setOriginal(double original) {
        this.original = original;
    }
    
    public double getConverted() {
        return converted;
    }

    public void setConverted(double converted) {
        this.converted = converted;
    }

    public abstract void compute();
}
