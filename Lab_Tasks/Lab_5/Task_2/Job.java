package Lab_Tasks.Lab_5.Task_2;

import java.util.Objects;

public class Job {
    private String designation;
    private float salary;
    private int id;

    // private static int count = 0;

    public Job(){
        this(new String(), 0, 0);
    }

    public Job(String designation, float salary, int id) {
        if (Objects.isNull(designation)) throw new RuntimeException();
        this.designation = designation;
        this.salary = salary;
        this.id = id;
    }

    public Job(Job obj){
        this(obj.getDesignation(), obj.getSalary(), obj.getId());
    }

    public String getDesignation() {
        return designation;
    }
    
    public void setDesignation(String designation) {
        if (Objects.nonNull(designation))
            this.designation = designation;
    }
    
    public float getSalary() {
        return salary;
    }
    
    public void setSalary(float salary) {
        this.salary = salary;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public boolean equals(Job obj){
        if (this == obj) return true;
        if (Objects.isNull(obj)) return false;
        if (this.id != obj.getId()) return false;
        if (this.salary != obj.getId()) return false;
        if (this.designation != obj.getDesignation()) return false;
        return true;
    }

    @Override
    public String toString() {
        return "[Designation: " + designation + ", Salary: " + salary + ", ID: " + id + "]";
    }
}
