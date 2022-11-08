package Lab_Tasks.Lab_7.Task_2;

public class Comedy extends Movie {
    private final double lateFee = 2.5;

    public Comedy(String title, int numberOfDays) {
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
