package Lab_Tasks.Lab_6.Task_2;

import java.util.Objects;

public class CommisionEmployee  {
    private String firstName;
    private String lastName;
    private String ssn;
    private double grossSale;
    private double commisionRate;

    public CommisionEmployee(){
        this("Hammad", "Saeedi", "FAOQ-12345", 0, 0);
    }

    public CommisionEmployee(String firstName, String lastName, String ssn, double grossSale, double commisionRate) {
        if (Objects.isNull(firstName) || Objects.isNull(lastName) || Objects.isNull(ssn)) throw new RuntimeException();
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.grossSale = grossSale;
        this.commisionRate = commisionRate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public double getGrossSale() {
        return grossSale;
    }

    public void setGrossSale(double grossSale) {
        this.grossSale = grossSale;
    }

    public double getCommisionRate() {
        return commisionRate;
    }

    public void setCommisionRate(double commisionRate) {
        this.commisionRate = commisionRate;
    }

    public double earnings(){
        return grossSale * commisionRate;
    }

    @Override
    public String toString() {
        return "CommisionEmployee [First Name: " + firstName + ", Last Name: " + lastName + ", SSN: " + ssn + ", Gross Sale: "
                + grossSale + ", Commision Rate: " + commisionRate + "]";
    }

    
}
