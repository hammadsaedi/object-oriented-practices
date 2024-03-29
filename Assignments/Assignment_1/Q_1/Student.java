package Assignments.Assignment_1.Q_1;

import java.util.Objects;

public class Student {
    private String registrationNumber;
    private String name;
    private float obtainedMarks;
    private float totalMarks;

    /**
     * Instantiate Student with default values
     */
    public Student() {
        this("FA22-BAI-001", "N/A", 0, 0);
    }

    /**
     * Instantiate Student
     * @param registrationNumber
     * @param name
     * @param totalMarks
     */
    public Student(final String registrationNumber, final String name, final float totalMarks) {
        this(registrationNumber, name, 0, totalMarks);
    }

    /**
     * Instantiate Student
     * @param registrationNumber
     * @param name
     * @param obtainedMarks
     * @param totalMarks
     */
    public Student(final String registrationNumber, final String name, final float obtainedMarks, final float totalMarks) {
        if (!isValidregistrationNumber(registrationNumber)) throw new RuntimeException("Invalid Registration Number.");
        this.registrationNumber = registrationNumber;
        if (Objects.isNull(name)) throw new RuntimeException("Name can't null.");
        this.name = name;

        if (totalMarks > 0) this.totalMarks = totalMarks;

        if (obtainedMarks > totalMarks || obtainedMarks < 0) throw new RuntimeException("Invalid obtained marks.");
        this.obtainedMarks = obtainedMarks;
    }

    /**
     * Instantiate Student (Copy Constructor)
     * @param obj
     */
    public Student(final Student obj){
        this(obj.registrationNumber, obj.name, obj.obtainedMarks, obj.totalMarks);
    }

    /**
     * Get Registration Number
     * @return Registration Number
     */
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * Set Registration Number
     * @param registrationNumber
     * Registration Number must be valid else no effect on state
     */
    public void setRegistrationNumber(final String registrationNumber) {
        if (isValidregistrationNumber(registrationNumber)) this.registrationNumber = registrationNumber;
    }

    /**
     * Get Name
     * @return Name
     */
    public String getName() {
        return name;
    }

    /**
     * Set Name
     * @param name
     * Name must not null else no effect on sate
     */
    public void setName(final String name) {
        if (Objects.nonNull(name)) this.name = name;
    }

    /**
     * Get Obtained Marks
     * @return Obtained Marks
     */
    public float getObtainedMarks() {
        return obtainedMarks;
    }

    /**
     * Set Obtained Marks
     * @param obtainedMarks
     * Obtained Marks must be positive and must not exceed Obtained Marks else no effect on state
     */
    public void setObtainedMarks(final float obtainedMarks) {
        if (obtainedMarks <= totalMarks && obtainedMarks > 0) this.obtainedMarks = obtainedMarks;
    }

    /**
     * Get Total Marks
     * @return Totals Marks
     */
    public float getTotalMarks() {
        return totalMarks;
    }

    /**
     * Set Total Marks
     * @param totalMarks
     * Total Marks must be positive else no effect on state
     */
    public void setTotalMarks(final float totalMarks) {
        if (totalMarks > 0) this.totalMarks = totalMarks;
    }

    /**
     * Get grades of this Student
     * @return Grades
     */
    public char grades(){
        final float percentage = obtainedMarks / totalMarks * 100;
        if (percentage <  60){
            return 'F';
        } else if (percentage <  70){
            return 'D';
        } else if (percentage < 80){
            return 'C';
        } else if (percentage < 90){
            return 'B';
        }
        return 'A';
    }

    /**
     * Check is Registration Number is Valid or not
     * @param registrationNumber
     * @return true if Registration Number is Valid
     */
    private boolean isValidregistrationNumber(String registrationNumber){
        if (registrationNumber.length() != 12) return false;
        
        registrationNumber = registrationNumber.toUpperCase();

        if (registrationNumber.charAt(0) != 'F' && registrationNumber.charAt(0) != 'S') return false;
        
        if (registrationNumber.charAt(0) == 'F' && registrationNumber.charAt(1) != 'A') return false;
        else if (registrationNumber.charAt(0) == 'S' && registrationNumber.charAt(1) != 'P') return false;

        if (!Character.isDigit(registrationNumber.charAt(2)) || !Character.isDigit(registrationNumber.charAt(3)) || !Character.isDigit(registrationNumber.charAt(9)) || !Character.isDigit(registrationNumber.charAt(10)) ||!Character.isDigit(registrationNumber.charAt(11))  ) return false;
        
        if (registrationNumber.charAt(4) == '-' && registrationNumber.charAt(8) != '-') return false;

        if (!Character.isLetter(registrationNumber.charAt(5)) || !Character.isLetter(registrationNumber.charAt(6)) || !Character.isLetter(registrationNumber.charAt(7))) return false;

        return true;
    }

    /**
     * Compare two Students on base of grades
     * @param s
     * @return if this object is greater 1; if this student is smaller -1; if both have same 0
     */
    public int compare(Student s){
        if (Float.floatToIntBits(this.grades()) > Float.floatToIntBits(s.grades())) return 1;
        if (Float.floatToIntBits(this.grades()) < Float.floatToIntBits(s.grades())) return -1;
        return 0;
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
        if (registrationNumber == null) {
            if (other.registrationNumber != null)
                return false;
        } else if (!registrationNumber.equals(other.registrationNumber))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (Float.floatToIntBits(obtainedMarks) != Float.floatToIntBits(other.obtainedMarks))
            return false;
        if (Float.floatToIntBits(totalMarks) != Float.floatToIntBits(other.totalMarks))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Student [Registration Number: " + registrationNumber + ", Name: " + name + ", Obtained Marks: " + obtainedMarks + ", Total Marks: " + totalMarks + "]";
    }
}
