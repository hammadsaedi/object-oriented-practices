package Lab_Tasks.Lab_6.Task_2;

public class BasePlusCommisionEmployee extends CommisionEmployee {
    private double salary;
    
    public BasePlusCommisionEmployee(){
        super();
        this.salary = 0;
    }

    public BasePlusCommisionEmployee(String firstName, String lastName, String ssn, double grossSale,
            double commisionRate, double salary) {
        super(firstName, lastName, ssn, grossSale, commisionRate);
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
    public double earnings(){
        return super.earnings() + salary;
    }

    @Override
    public String toString() {
        return super.toString() +  " [Salary: " + salary + "]";
    }
}
