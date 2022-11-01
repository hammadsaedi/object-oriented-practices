package Lab_Tasks.Lab_6.Task_6;

import java.util.Objects;

import Lab_Tasks.Lab_5.Task_3.Address;

public class Student extends Person {
    private String status;

    public Student(String name, Address address, String number, String email, String status) {
        super(name, address, number, email);
        if (Objects.isNull(status)) throw new NullPointerException();
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return super.toString() + " Student [Status: " + status + "]";
    }
}
