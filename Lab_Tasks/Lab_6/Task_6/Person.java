package Lab_Tasks.Lab_6.Task_6;

import java.util.Objects;

import Lab_Tasks.Lab_5.Task_3.Address;

public class Person {
    private String name;
    private Address address;
    private String number;
    private String email;

    
    public Person(String name, Address address, String number, String email) {
        if (Objects.isNull(name) || Objects.isNull(address) || Objects.isNull(number)  || Objects.isNull(email) )
            
        this.name = name;
        this.address = address;
        this.number = number;
        this.email = email;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Address getAddress() {
        return new Address(address);
    }
    
    public void setAddress(Address address) {
        this.address = new Address(address);
    }
    
    public String getNumber() {
        return number;
    }
    
    public void setNumber(String number) {
        this.number = number;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
