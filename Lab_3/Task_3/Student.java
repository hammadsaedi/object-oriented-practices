package Lab_3.Task_3;

public class Student {
    private String name;
    private double[] marks = new double[5];
    private int size;

    public Student() {
        this("Hammad Saeedi", new double[] {90, 95, 97});
    }

    public Student(String name, double[] marks) {
        if (name == null) throw new RuntimeException("Name can't be null");
        this.name = name;
        int size = compatibleArraySize(marks);
        this.size = size;
        for (int i = 0; i < size; i++) {
            this.marks[i] = marks[i];
        }
    }

    private int compatibleArraySize(double[] marks){
        return Math.min(marks.length, this.marks.length);
    }

    public double average(){
        double average = 0;
        for (int i = 0; i < marks.length; i++) {
            average += marks[i] / marks.length;
        }
        return average;
    }

    private double[] getDeepCopy() {
        double[] marks = new double[size];
        for (int i = 0; i < size; i++){
            marks[i] = this.marks[i];
        }
        return marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double[] getMarks() {
        return getDeepCopy();
    }

    public boolean setMarks(double marks) {
        if (size >= this.marks.length) return false;
        this.marks[size++] = marks;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder("Student [Name: " + name + ", Marks: ");
        for (int i = 0; i < size; i++) {
            if (i == size -1){
                buffer.append(marks[i] + "]");
                break;
            }
            buffer.append(marks[i] + ", ");
        }
        return buffer.toString();
    } 
}
