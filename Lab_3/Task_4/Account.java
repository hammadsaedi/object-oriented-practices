package Lab_3.Task_4;

import java.math.BigDecimal;

public class Account {
    private BigDecimal balance;
    
    public Account(float balance) {
        this.balance = BigDecimal.valueOf(balance);
    }
    
    public Account() {
        this(0f);
    }

    public float getBalance() {
        return balance.floatValue();
    }

    public void setBalance(float balance) {
        this.balance = BigDecimal.valueOf(balance);
    }

    public void withdrawal(float amount){
        BigDecimal request = BigDecimal.valueOf(amount);
        if (request.compareTo(balance) == 1) throw new RuntimeException("Requested Amount is higher than current balance."); 
        balance.subtract(BigDecimal.valueOf(amount));
    }

    public void deposit(float amount){
        balance.add(BigDecimal.valueOf(amount));
    }

    @Override
    public String toString() {
        return "Account [Balance: " + balance + "]";
    }
    
}