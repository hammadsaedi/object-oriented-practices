package MidTerm;

import java.util.Objects;

public class Item {
    private String id;
    private String name;
    private double price;

    public Item(String id, String name, double price) {
        if (Objects.isNull(id)  || Objects.isNull(name)) throw new NullPointerException();
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        if (Objects.nonNull(id))
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        if (Objects.nonNull(name))
        this.name = name;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item [ID: " + id + ", Name: " + name + ", Price: " + price + "]";
    }
}
