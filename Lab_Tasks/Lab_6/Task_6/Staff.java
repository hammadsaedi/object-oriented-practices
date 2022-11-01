package Lab_Tasks.Lab_6.Task_6;

import java.util.Objects;

import Lab_Tasks.Lab_5.Task_1.Date;
import Lab_Tasks.Lab_5.Task_3.Address;

public class Staff extends Employee {
    private String title;

    public Staff(String name, Address address, String number, String email, String office, double salary, Date hireDate,
            String title) {
        super(name, address, number, email, office, salary, hireDate);
        if (Objects.isNull(title)) throw new NullPointerException(); 
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return s
        ff [Title: " + title + "]";
    }   
}
