package Lab_Tasks.Lab_4.Part_2.Task_2;

import java.time.LocalDate;
import java.util.Objects;

public class Account {
    private double balance;
    private int yearOfOpening;
    private String cnic;

    /**
     * Instantiate Account Object
     */
    Account(){
        this(0, LocalDate.now().getYear(), null);
    }

    /**
     * Instantiate Account Object
     * @param balance
     */
    public Account(double balance){
        this(balance, LocalDate.now().getYear(), null);
    }

    public Account (Account other) {
        this(other.balance, other.yearOfOpening, other.cnic);
    }

    /**
     * Instantiate Account Object
     * @param balance Initial Balance - can never be set to negative; If passed no assignment will take place
     * @param yearOfOpening cannot be greater than current year; If passed then instantiate with current year
     * @param cnic must be valid CNIC else will be empty string
     */
    public Account(double balance, int yearOfOpening, String cnic) {
        if (balance > 0) 
            this.balance = balance;
        
        if (yearOfOpening <= LocalDate.now().getYear()) {
            this.yearOfOpening = yearOfOpening;
        } else {
            this.yearOfOpening = LocalDate.now().getYear();
        }

        if (Objects.nonNull(cnic) && isValidCNIC(cnic)){
            this.cnic = cnic;
        } else {
            this.cnic = new String();
        }
    }

    /**
     * @param amount can never be set to negative; If passed no assignment will take place
     */
    public void deposit(double amount){
        if (amount > 0) {
            this.balance += amount;
        }
    }

    /**
     * @param amount
     * @throws RuntimeException If requested amount is greater than Account balance
     */
    public void withdraw(double amount) throws RuntimeException {
        if (this.balance >= amount){
            this.balance -= amount;
        } else {
            throw new RuntimeException("Balance is lower than requested.");
        }
    }
    
    /**
     * @param cnic must be valid CNIC else will remain same
     */
    public void setCnic(String cnic) {
        if (isValidCNIC(cnic)){
            this.cnic = cnic;
        }
    }
    /**
     * @param yearOfOpening cannot be greater than current year; If passed then remain same
     */
    public void setYearOfOpening(int yearOfOpening) {
        if (yearOfOpening <= LocalDate.now().getYear()) {
            this.yearOfOpening = yearOfOpening;
        }
    }

    /**
     * @return account balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @return Year of Opening account
     */
    public int getYearOfOpening() {
        return yearOfOpening;
    }

    /**
     * @return CNIC of account
     */
    public String getCnic() {
        return cnic;
    }

    /**
     * @return age of account
     */
    public int calculateAgeOfAccount(){
        return LocalDate.now().getYear() - this.yearOfOpening;
    }

    /**
     * @param cnic
     * @return true is cnic is valid
     */
    public static boolean isValidCNIC(String cnic){
        if (cnic.length() == 15){
            if (cnic.charAt(5) == '-' && cnic.charAt(13) == '-') {
                boolean letters = true;
                for (int i = 0; i < 5; i++) {
                    if(i == 5 || i == 13){
                        continue;
                    }
                    if (!(Character.isDigit(cnic.charAt(i)))){
                        letters = false;
                        break;
                    }
                }
                return letters;
            }
        }
        return false;
    }

    public int compare(Account other){
        if(Double.doubleToLongBits(this.balance) > Double.doubleToLongBits(other.balance))
            return 1;
        if(Double.doubleToLongBits(this.balance) < Double.doubleToLongBits(other.balance))
            return -1;
        return 0;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj)
            return true;
        if (Objects.isNull(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Account other = (Account) obj;
        if(Double.doubleToLongBits(this.balance) != Double.doubleToLongBits(other.balance))
            return false;
        if (this.yearOfOpening != other.yearOfOpening)
            return false;
        if (Objects.isNull(this.cnic)) {
            if (Objects.nonNull(other.cnic)) {
                return false;
            }
        } else {
            if (!this.cnic.equals(other.cnic)) 
                return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Account [CNIC: " + cnic + ", Balance: " + balance  + ", Year Of Opening: " + yearOfOpening + "]";
    }
}
