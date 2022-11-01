package Lab_Tasks.Lab_6.Task_5;

public class Truck extends Vehicle {
    private double loadCapacity;
    private int towingCapacity;

    public Truck(String manufacturerName, int noOfCylinders, Person owner, double loadCapacity, int towingCapacity) {
        super(manufacturerName, noOfCylinders, owner);
        this.loadCapacity = loadCapacity;
        this.towingCapacity = towingCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public int getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(int towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    @Override
    public String toString() {
        return super.toString() +  " Truck [Load Capacity: " + loadCapacity + ", Towing Capacity: " + towingCapacity + "]";
    }
}
