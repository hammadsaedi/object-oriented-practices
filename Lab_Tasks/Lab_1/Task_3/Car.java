package Task_3;

public class Car {
    public String ID;
    public String name;
    public String model;
    public String color;
    public float price;
    public String owner;
    
    public Car(String iD, String name, String model, String color, float price, String owner) {
        ID = iD;
        this.name = name;
        this.model = model;
        this.color = color;
        this.price = price;
        this.owner = owner;
    }

    public String getID() {
        return ID;
    }

    public void setID(String iD) {
        ID = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "\nModel: " + this.model + "\nID: " + this.ID + "\nColor: " + this.color + "\nPrice: " + price + "\nOwner: " + owner;
    }
}
