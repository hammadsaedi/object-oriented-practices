package Assignments.Assignment_3;

public abstract class GeometricObject implements Comparable<GeometricObject>, Cloneable {
    protected boolean isFilled;
    protected String color;
    protected double thickness;

    public GeometricObject(boolean isFilled, String color, double thickness) {
        this.isFilled = isFilled;
        this.color = color;
        this.thickness = thickness;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean isFilled) {
        this.isFilled = isFilled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getThickness() {
        return thickness;
    }

    public void setThickness(double thickness) {
        this.thickness = thickness;
    }

    public abstract double area();

    public double volume(){
        return thickness;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        GeometricObject other = (GeometricObject) obj;
        if (isFilled != other.isFilled)
            return false;
        if (color == null) {
            if (other.color != null)
                return false;
        } else if (!color.equals(other.color))
            return false;
        if (Double.doubleToLongBits(thickness) != Double.doubleToLongBits(other.thickness))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "GeometricObject [Is Filled: " + isFilled + ", Color: " + color + ", Thickness: " + thickness + "]";
    }
    
}
