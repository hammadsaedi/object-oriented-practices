package Lab_Tasks.Lab_6.Task_5;

import java.util.Objects;

public class Vehicle {
    private String manufacturerName;
    private int noOfCylinders;
    private Person owner;

    public Vehicle(String manufacturerName, int noOfCylinders, Person owner) {
        if (Objects.isNull(manufacturerName) || Objects.isNull(owner) ) 
            throw new NullPointerException();
        this.manufacturerName = manufacturerName;
        this.noOfCylinders = noOfCylinders;
        this.owner = new Person(owner.getName(), owner.getAge());
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public int getNoOfCylinders() {
        return noOfCylinders;
    }

    public void setNoOfCylinders(int noOfCylinders) {
        this.noOfCylinders = noOfCylinders;
    }

    public Person getOwner() {
        return new Person(owner.getName(), owner.getAge());
    }

    public void setOwner(Person owner) {
        this.owner = new Person(owner.getName(), owner.getAge());
    }

    @Override
    public String toString() {
        return "Vehicle [Manufacturer Name: " + manufacturerName + ", No Of Cylinders: " + noOfCylinders + ", Owner: " + owner
                + "]";
    }
}
