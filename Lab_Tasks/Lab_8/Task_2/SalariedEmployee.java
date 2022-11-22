package Lab_Tasks.Lab_8.Task_2;

public class SalariedEmployee extends Employee {
    public double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String SSN, double weeklySalary) {
        super(firstName, lastName, SSN);
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double getPayableAmount() {
        return weeklySalary;
    }

    @Override
    public String toString() {
        return super.toString() + " WeeklyEmployee [Weekly Salary: " + weeklySalary + "]";
    }
    
}
