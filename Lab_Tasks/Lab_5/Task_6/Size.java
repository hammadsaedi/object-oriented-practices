package Lab_Tasks.Lab_5.Task_6;

public enum Size {
    small(10),
    medium(12), 
    large(14);

    private double price;
    
    public double getPrice(){
        return price;
    }

    Size(double price){
        this.price = price;
    }
}
