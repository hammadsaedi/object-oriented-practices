package Lab_Tasks.Lab_7.Task_1;

public class CommissionEmployee extends Employee {
    private double grossSale;
    private double commissionRate;

    public CommissionEmployee(){
        this("Hammad", "Saeedi", "FAOQ-12345", 0, 0);
    }

    public CommissionEmployee(String firstName, String lastName, String SSN, double grossSale, double commissionRate) {
        super(firstName, lastName, SSN);
        this.grossSale = grossSale;
        this.commissionRate = commissionRate;
    }

    public double getGrossSale() {
        return grossSale;
    }

    public void setGrossSale(double grossSale) {
        this.grossSale = grossSale;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    @Override
    public double earning(){
        return grossSale * commissionRate;
    }

    @Override
    public String toString() {
        return super.toString() + " CommissionEmployee [Gross Sale: " + grossSale + ", Commission Rate: " + commissionRate + "]";
    }    
}
