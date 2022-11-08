package Lab_Tasks.Lab_7.Task_1;

public class WeeklyEmployee extends Employee {
    private int weeklySalary;

    public WeeklyEmployee(final String firstName, final String lastName, final String SSN, final int weeklySalary) {
        super(firstName, lastName, SSN);
        this.weeklySalary = weeklySalary;
    }

    public int getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(final int weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double earning() {
        return weeklySalary * 4;
    }

    @Override
    public String toString() {
        return super.toString() + " WeeklyEmployee [Weekly Salary: " + weeklySalary + "]";
    }
}
