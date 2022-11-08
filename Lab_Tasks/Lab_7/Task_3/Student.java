package Lab_Tasks.Lab_7.Task_3;

public class Student extends Person {
    private double cgpa;

    public Student(String name, double cgpa) {
        super(name);
        this.cgpa = cgpa;
    }
    
    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(int cgpa) {
        this.cgpa = cgpa;
    }

    @Override
    public boolean isOutstanding() {
        return Double.doubleToLongBits(cgpa) > Double.doubleToLongBits(3.5);
    }
}
