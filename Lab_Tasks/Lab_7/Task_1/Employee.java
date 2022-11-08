package Lab_Tasks.Lab_7.Task_1;

import java.util.Objects;

public abstract class Employee {
    private String firstName;
    private String lastName;
    private String SSN;
    
    public Employee(final String firstName, final String lastName, final String SSN) {
        if (Objects.isNull(firstName) || Objects.isNull(lastName) || Objects.isNull(SSN)) throw new NullPointerException();
        this.firstName = firstName;
        this.lastName = lastName;
        this.SSN = SSN;
    }

    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(final String firstName) {
        if (Objects.nonNull(firstName))
            this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(final String lastName) {
        if (Objects.nonNull(lastName))
            this.lastName = lastName;
    }
    
    public String getSSN() {
        return SSN;
    }
    
    public void setSSN(final String SSN) {
        if (Objects.nonNull(SSN))
            this.SSN = SSN;
    }

    public abstract double earning();

    @Override
    public String toString() {
        return "Employee [First Name: " + firstName + ", Last Name: " + lastName + ", SSN:  " + SSN + "]";
    }    
}
