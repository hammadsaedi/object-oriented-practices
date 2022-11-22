package Lab_Tasks.Lab_8.Task_2;

public class Invoice implements Payable {
    private int quantity;
    private String partName;
    private String description;
    private double pricePerItem;

    public Invoice(int quantity, String partName, String description, double pricePerItem) {
        this.quantity = quantity;
        this.partName = partName;
        this.description = description;
        this.pricePerItem = pricePerItem;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    @Override
    public double getPayableAmount() {
        return quantity * pricePerItem;
    }

    @Override
    public String toString() {
        return "Invoice [Quantity: " + quantity + ", Part Name: " + partName + ", Description: " + description
                + ", Price Per Item: " + pricePerItem + "]";
    } 
}
