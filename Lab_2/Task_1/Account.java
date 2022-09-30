package Lab_2.Task_1;

import java.time.LocalDate;

public class Account {
    private double balance;
    private int yearOfOpening;
    private String cnic;

    /**
     * Instantiate Account Object
     * @apiNote yearOfOpening attribute is current year at the time of class instantiation (Automatic)
     * @apiNote cnic remains null
     * @apiNote Instantiate with zero balance
     */
    Account(){
        this.yearOfOpening = LocalDate.now().getYear();
    }

    /**
     * Instantiate Account Object
     * @param balance Initial Balance - can never be set to negative; If passed no assignment will take place
     * @apiNote yearOfOpening attribute is current year at the time of class instantiation (Automatic)
     * @apiNote cnic remains null
     */
    Account(double balance){
        this();
        if (balance > 0) {
            this.balance = balance;
        }
    }

    /**
     * Instantiate Account Object
     * @param balance Initial Balance - can never be set to negative; If passed no assignment will take place
     * @param yearOfOpening cannot be greater than current year; If passed then instantiate with current year
     * @param cnic must be valid CNIC else will remain NULL
     */
    public Account(double balance, int yearOfOpening, String cnic) {
        if (balance > 0) {
            this.balance = balance;
        }
        if (yearOfOpening <= LocalDate.now().getYear()) {
            this.yearOfOpening = yearOfOpening;
        }
        if (cnic.length() == 15){
            if (cnic.charAt(5) == '-' && cnic.charAt(13) == '-') {
                boolean letters = true;
                for (int i = 0; i < 15 ; i++) {
                    if(i == 5 || i == 13){
                        continue;
                    }
                    if (!(Character.isDigit(cnic.charAt(i)))){
                        letters = false;
                        break;
                    }
                }
                if(letters){
                    this.cnic = cnic;
                }
            }
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

    @Override
    public String toString() {
        return "Account [CNIC: " + cnic + ", Balance: " + balance  + ", Year Of Opening: " + yearOfOpening + "]";
    }
}
