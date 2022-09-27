package act_3;

public class CarPart {
    private String modelNumber;
    private String partNumber;
    private String cost;

    // CarPart(String modelNumber, String partNumber, String cost) {
    //     this.modelNumber = modelNumber;
    //     this.partNumber = partNumber;
    //     this.cost = cost;
    // }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getCost() {
        return cost;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public String toString() {
        return "Model Number: " + modelNumber + "\nPart Number: " + partNumber+ "\nCost: " + cost;
    }
}
