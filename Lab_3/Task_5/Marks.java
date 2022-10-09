package Lab_3.Task_5;

public class Marks {
    private float marks1;
    private float marks2;
    private float marks3;

    /**
     * Instantiate Marks
     * @param marks1
     * @param marks2
     * @param marks3
     * @throws RuntimeException if any of marks is negative
     */
    public Marks(float marks1, float marks2, float marks3) {
        if(marks1 < 0 || marks2 < 0 || marks3 < 0) throw new RuntimeException("Marks can never be negative.");
        if(marks1 > 100 || marks2 > 100 || marks3 > 100) throw new RuntimeException("Marks can not be higher than 100.");
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    /**
     * Instantiate Marks with all marks zeroed
     */
    public Marks() {
        this(0, 0, 0);
    }

    private float calculateTotalMarks(){
        return marks1 + marks1 + marks3;
    }

    public float getPercentage(){
        return calculateTotalMarks() / 300 * 100;
    }

    public float getMarks1() {
        return marks1;
    }

    public boolean setMarks1(float marks1) {
        if(marks1 < 0 || marks1 > 100 ) return false;
        this.marks1 = marks1;
        return true;
    }

    public float getMarks2() {
        return marks2;
    }

    public boolean setMarks2(float marks2) {
        if(marks2 < 0 || marks2 > 100 ) return false;
        this.marks2 = marks2;
        return true;
    }

    public float getMarks3() {
        return marks3;
    }

    public boolean setMarks3(float marks3) {
        if(marks3 < 0 || marks3 > 100 ) return false;
        this.marks3 = marks3;
        return true;
    }

    @Override
    public String toString() {
        return "Marks [I: " + marks1 + ", II: " + marks2 + ", III: " + marks3 + "]";
    }
}
