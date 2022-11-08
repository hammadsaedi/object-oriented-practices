package Lab_Tasks.Lab_7.Task_2;

public class Action extends Movie {
    private final double lateFee = 3;

    public Action(String title, int numberOfDays) {
        super(title, numberOfDays);
    }

    @Override
    public double calculateLateFee(int days) {
        return days * lateFee;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
