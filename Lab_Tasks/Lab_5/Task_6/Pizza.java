package Lab_Tasks.Lab_5.Task_6;

import java.util.Objects;

public class Pizza {
    private Size size;
    private int cheeseToppings;
    private int pepperoniToppings;
    private int hamToppings;

    public Pizza(Size size, int cheeseToppings, int pepperoniToppings, int hamToppings) {
        if (Objects.isNull(size)) 
            throw new NullPointerException();
        this.size = size;
        this.cheeseToppings = cheeseToppings;
        this.pepperoniToppings = pepperoniToppings;
        this.hamToppings = hamToppings;
    }

    public double calculateCost(){
        double cost = 0;
        cost += size.getPrice();
        cost += 2 * cheeseToppings;
        cost += 2 * pepperoniToppings;
        cost += 2 * hamToppings;
        return cost;
    }

    @Override
    public String toString(){
        return "Pizza [ Size: " + size.name() + " , Cheese Toppings: " + cheeseToppings + " , Pepperoni Toppings: " +  pepperoniToppings + " , Ham Toppings: " + hamToppings + ", Cost: " + calculateCost() + "]";
    }
}
