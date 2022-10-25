package Lab_Tasks.Lab_5.Task_2;

import Lab_Tasks.Lab_5.Task_1.Date;
import java.util.Objects;

public class Employee {
    private String firstName;
    private String lastName;
    private Date birthDate;
    private Date hireDate;
    private Job job;

    public Employee(){
        this(new String(), new String(), new Date(), new Date(), new Job());
    }

    public Employee(Employee obj){
        this(obj.getFirstName(), obj.getLastName(), obj.getBirthDate(), obj.getHireDate(), obj.getJob());
    }
    
    public Employee(String firstName, String lastName, Date birthDate, Date hireDate, Job job) {
        if (Objects.isNull(firstName) || Objects.isNull(lastName) || Objects.isNull(birthDate) || Objects.isNull(hireDate) || Objects.isNull(job)) throw new NullPointerException();
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = new Date(birthDate);
        this.hireDate = new Date(hireDate);
        this.job = new Job(job);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (Objects.nonNull(firstName))
            this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (Objects.nonNull(lastName))
            this.lastName = lastName;
    }

    public Date getBirthDate() {
        return new Date(birthDate);
    }

    public void setBirthDate(Date birthDate) {
        if (Objects.nonNull(birthDate))
            this.birthDate = new Date(birthDate);
    }

    public Date getHireDate() {
        return new Date(hireDate);
    }

    public void setHireDate(Date hireDate) {
        if (Objects.nonNull(hireDate))
            this.hireDate = new Date(hireDate);
    }

    public Job getJob(){
        return new Job(job);
    }

    public void setJob(Job job){
        if (Objects.nonNull(job))
            this.job = new Job(job);
    }

    public String getDesignation() {
        return job.getDesignation();
    }
    
    public void setDesignation(String designation) {
        job.setDesignation(designation);
    }
    
    public float getSalary() {
        return job.getSalary();
    }
    
    public void setSalary(float salary) {
        job.setSalary(salary);
    }
    
    public int getId() {
        return job.getId();
    }
    
    public void setId(int id) {
        job.setId(id);
    }

    public boolean isExperienced(){
        if (2022 - hireDate.getYear() < 5) 
            return false;
        return true;
    }

    public boolean greaterThan50k(){
        if (job.getSalary() > 50000) return true;
        return false;
    }

    public boolean equals(Employee obj) {
        if (!firstName.equals(obj.firstName))
            return false;
        if (!lastName.equals(obj.lastName))
            return false;
        if (!birthDate.equals(obj.birthDate))
            return false;
        if (!hireDate.equals(obj.hireDate))
            return false;
        if (!job.equals(obj.getJob())) 
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Employee [First Name: " + firstName + ", Last Name: " + lastName + ", Birth Date: " + birthDate
                + ", Hire Date: " + hireDate + " Job" + job + "]";
    }
}
