package Lab_Tasks.Lab_6.Task_6;

import java.util.Objects;

import Lab_Tasks.Lab_5.Task_1.Date;
import Lab_Tasks.Lab_5.Task_3.Address;

public class Faculty extends Employee {
    private int officeHour;
    private String rank;

    public Faculty(String name, Address address, String number, String email, String office, double salary,
            Date hireDate, int officeHour, String rank) {
        super(name, address, number, email, office, salary, hireDate);
        if (Objects.isNull(rank)) throw new NullPointerException();
        this.officeHour = officeHour;
        this.rank = rank;
    }

    public int getOfficeHour() {
        return officeHour;
    }

    public void setOfficeHour(int officeHour) {
        this.officeHour = officeHour;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return super.toString() + " Faculty [Office Hour: " + officeHour + ", Rank: " + rank + "]";
    }
}
