package Lab_Tasks.Lab_7.Task_1;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double salary;

    public BasePlusCommissionEmployee(){
        super();
        this.salary = 0;
    }

    public BasePlusCommissionEmployee(String firstName, String lastName, String ssn, double grossSale,
            double commissionRate, double salary) {
        super(firstName, lastName, ssn, grossSale, commissionRate);
        if (salary < 0) throw new RuntimeException();
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double earning(){
        return super.earning() + salary;
    }

    @Override
    public String toString() {
        return super.toString() +  " [Salary: " + salary + "]";
    }
}
