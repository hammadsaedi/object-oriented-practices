package Lab_Tasks.Lab_3.Task_3;

import java.util.Arrays;

public class Student {
    private String name;
    private double[] marks = {-1, -1, -1, -1, -1};
    // private int size;

    /**
     * Instantiate Student
     * @apiNote name => Hammad Saeedi
     * <li>marks => 90, 95, 97 
     */
    public Student() {
        this("Hammad Saeedi", new double[] {90, 95, 97});
    }

    /**
     * Instantiate Student
     * @param name
     * @param marks
     * @throws RuntimeException if name is null
     */
    public Student(String name, double[] marks) {
        if (name == null) throw new RuntimeException("Name can't be null");
        this.name = name;
        int size = compatibleArraySize(marks);
        for (int i = 0; i < size; i++) {
            if(marks[i] < 0) throw new RuntimeException("Marks cannot negative");
            this.marks[i] = marks[i];
        }
    }

    /**
     * Returns appropriate size of array
     * @param marks double array whose length has to be compared
     * @return size
     */
    private int compatibleArraySize(double[] marks){
        return Math.min(marks.length, this.marks.length);
    }

    /**
     * Average Marks
     * @return average of marks
     */
    public double average(){
        double sum = 0;
        int len = 0;
        for (int i = 0; i < marks.length; i++) {
            if(marks[i] == -1) break;
            sum += marks[i] / marks.length;
            len++;
        }
        return len != 0 ? sum / len : 0;
    }

    /**
     * Size of Marks Array
     * @return size
     */
    private int getSize(){
        int size = 0;
        while (size < this.marks.length){
            if (this.marks[size++] == -1) {
                --size;
                break;
            }
        }
        return size;
    }

    /**
     * Returns Deep Copy of Marks array
     * @return marks
     */
    private double[] getDeepCopy() {
        int size = getSize();
        double[] marks = new double[size];
        for (int i = 0; i < size; i++){
            if (this.marks[i] == -1) break;
            marks[i] = this.marks[i];
        }
        return marks;
    }

    /**
     * Get Name of this student
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Set name of this student
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get Marks
     * @return Deep Copy of this student's marks
     */
    public double[] getMarks() {
        return getDeepCopy();
    }

    /**
     * Set marks 
     * @param marks
     * @return true if marks added
     * @apiNote insertion is maintained in consecutive manner 
     */
    public boolean setMarks(double marks) {
        if (marks < 0) return false;
        if (getSize() >= this.marks.length) return false;
        this.marks[getSize()] = marks;
        return true;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (!Arrays.equals(marks, other.marks))
            return false;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder("Student [Name: " + name + ", Marks: ");
        int size = getSize();
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
