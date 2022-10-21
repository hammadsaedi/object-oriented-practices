package Lab_Tasks.Lab_3.Task_4;

import java.math.BigDecimal;

public class Account {
    private BigDecimal balance;
    
    /**
     * Instantiate Account with given balance
     * @param balance
     */
    public Account(float balance) {
        if (balance < 0) throw new RuntimeException("Balance can't be negative.");
        this.balance = BigDecimal.valueOf(balance);
    }
    
    /**
     * Instantiate Balance with 0 balance
     */
    public Account() {
        this(0f);
    }

    /**
     * Get Balance
     * @return balance of this account
     */
    public float getBalance() {
        return balance.floatValue();
    }

    /**
     * withdraw amount from account 
     * @param amount
     * @throws RuntimeException if requested amount is higher than balance
     */
    public void withdrawal(float amount){
        BigDecimal request = BigDecimal.valueOf(amount);
        if (request.compareTo(balance) == 1) throw new RuntimeException("Requested Amount is higher than current balance."); 
        balance.subtract(BigDecimal.valueOf(amount));
    }

    /**
     * Deposit amount in this account
     * @param amount
     * @return true if amount get deposit
     */
    public boolean deposit(float amount){
        if (amount < 0) return false;
        balance.add(BigDecimal.valueOf(amount));
        return true;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Account other = (Account) obj;
        if (balance == null) {
            if (other.balance != null)
                return false;
        } else if (!balance.equals(other.balance))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Account [Balance: " + balance + "]";
    }
    
}