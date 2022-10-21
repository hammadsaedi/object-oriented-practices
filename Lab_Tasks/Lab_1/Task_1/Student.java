package Task_1;

import act_2.Date;

// A Student is an object in a university management System. 
// Analyze the concept and identify the data 
// members that a Student class should have.
// Also analyze the behavior of student in a university 
// management System and identify the methods that should be included in Student class.

public class Student {
    public String id;
    public String name;
    public Date dob;
    public String department;
    public String program;
    
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getDob() {
        return dob;
    }

    public String getDepartment() {
        return department;
    }

    public String getProgram() {
        return program;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String toString() {
        return "Student ID: " + this.id + "\nStudent Name: " + this.name + "\nDOB: " + this.dob + "\nDepartment: " + this.department + "\nProgram: " + this.program;
    }
}
