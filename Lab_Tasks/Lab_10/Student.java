package Lab_Tasks.Lab_10;

public class Student extends Person {
    private String regNum;
    private double gpa;
    private int semester;
    private Department department;
    
    public Student(Student student){
        this(student.name, student.mail, student.gender, student.regNum, student.gpa, student.semester, student.department);
    }

    public Student(String name, String mail, String gender, String regNum, double gpa, int semester, Department department) {
        super(name, mail, gender);
        this.regNum = regNum;
        this.gpa = gpa;
        this.semester = semester;
        this.department = new Department(department.getName(), department.getLocation());
    }

    public String getRegNum() {
        return regNum;
    }

    public void setRegNum(String regNum) {
        this.regNum = regNum;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
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
        if (regNum == null) {
            if (other.regNum != null)
                return false;
        } else if (!regNum.equals(other.regNum))
            return false;
        if (Double.doubleToLongBits(gpa) != Double.doubleToLongBits(other.gpa))
            return false;
        if (semester != other.semester)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return super.toString()+ " Student [RegNum: " + regNum + ", GPA: " + gpa + ", Semester: " + semester + "Department: " + department + "]";
    }
}
