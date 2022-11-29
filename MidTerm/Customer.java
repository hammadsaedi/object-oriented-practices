package MidTerm;

import java.util.Objects;

public class Customer extends Person {
    private String customerId;
    private String password;

    public Customer(String name, int age, String customerId, String password) {
        super(name, age);
        if (Objects.isNull(customerId) || Objects.isNull(password)) throw new NullPointerException();
        this.customerId = customerId;
        this.password = password;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        if (Objects.nonNull(customerId))
        this.customerId = customerId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (Objects.nonNull(password))
        this.password = password;
    }

    @Override
    public String toString() {
        return super.toString() + "Customer [Customer ID: " + customerId + ", Password: " + password + "]";
    }
}
