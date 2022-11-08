package Lab_Tasks.Lab_7.Task_1;

public class HourlyEmployee extends Employee {
    private int hours;
    private int wagePerHours;

    public HourlyEmployee(String firstName, String lastName, String SSN, int hours, int wagePerHours) {
        super(firstName, lastName, SSN);
        this.hours = hours;
        this.wagePerHours = wagePerHours;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getWagePerHours() {
        return wagePerHours;
    }

    public void setWagePerHours(int wagePerHours) {
        this.wagePerHours = wagePerHours;
    }

    @Override
    public double earning() {
        return hours * wagePerHours;
    }

    @Override
    public String toString() {
        return super.toString() + " Hourly Employee [Hours: " + hours + ", Wage Per Hours: " + wagePerHours + "]";
    }
}
