package Lab_Tasks.Lab_6.Task_6;

import java.util.Objects;

import Lab_Tasks.Lab_5.Task_1.Date;
import Lab_Tasks.Lab_5.Task_3.Address;

public class Employee extends Person {
    private String office;
    private double salary;
    private Date hireDate;

    public Employee(String name, Address address, String number, String email, String office, double salary,
            Date hireDate) {
        super(name, address, number, email);
        if (Objects.isNull(office) || Objects.isNull(salary) || Objects.isNull(hireDate) )
        this.office = office;
        this.salary = salary;
        this.hireDate =  new Date(hireDate);
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return super.toString() + " Employee [Office: " + office + ", Salary: " + salary + ", Hire Date: " + hireDate + "]";
    }
}
