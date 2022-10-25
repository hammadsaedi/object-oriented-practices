package Lab_Tasks.Lab_5.Task_3;

import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private Address address;

    public Person(){
        this(new String(), new String(), new Address());
    }

    public Person(Person obj){
        this(obj.firstName, obj.lastName, obj.address);
    }

    public Person(String firstName, String lastName, Address address) {
        if (Objects.isNull(firstName) || Objects.isNull(lastName) || Objects.isNull(address)) throw new RuntimeException();
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = new Address(address);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (Objects.nonNull(firstName))
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (Objects.nonNull(firstName))
            this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        if (Objects.nonNull(firstName))
            this.address = new Address(address);
    }

    public boolean isBorgor(){
        return address.getCity().equals("Islamabad");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (firstName == null) {
            if (other.firstName != null)
                return false;
        } else if (!firstName.equals(other.firstName))
            return false;
        if (lastName == null) {
            if (other.lastName != null)
                return false;
        } else if (!lastName.equals(other.lastName))
            return false;
        if (address == null) {
            if (other.address != null)
                return false;
        } else if (!address.equals(other.address))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Person [First Name: " + firstName + ", Last Name: " + lastName + ", Address: " + address + "]";
    }
}
