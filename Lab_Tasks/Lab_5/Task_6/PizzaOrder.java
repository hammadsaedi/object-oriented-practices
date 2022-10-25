package Lab_Tasks.Lab_5.Task_6;

import java.util.Objects;

public class PizzaOrder {
    private Pizza pizza1;
    private Pizza pizza2;
    private Pizza pizza3;

    public PizzaOrder(Pizza pizza1) {
        this.pizza1 = pizza1;
    }

    public PizzaOrder(Pizza pizza1, Pizza pizza2) {
        this.pizza1 = pizza1;
        this.pizza2 = pizza2;
    }

    public PizzaOrder(Pizza pizza1, Pizza pizza2, Pizza pizza3) {
        this.pizza1 = pizza1;
        this.pizza2 = pizza2;
        this.pizza3 = pizza3;
    }

    public void setPizza1(Pizza pizza1) {
        this.pizza1 = pizza1;
    }

    public void setPizza2(Pizza pizza2) {
        this.pizza2 = pizza2;
    }

    public void setPizza3(Pizza pizza3) {
        this.pizza3 = pizza3;
    }

    public double calculateCost(){
        double cost = 0;
        if (Objects.nonNull(pizza1))
            cost += pizza1.calculateCost();
        if (Objects.nonNull(pizza2))
            cost += pizza2.calculateCost();
        if (Objects.nonNull(pizza3))
            cost += pizza3.calculateCost();
        return cost;
    }

    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("Orders: ");
        if (Objects.nonNull(pizza1))
            buffer.append("\nPizza: " + pizza1);
        if (Objects.nonNull(pizza2))
            buffer.append("\nPizza: " + pizza2);
        if (Objects.nonNull(pizza3))
            buffer.append("\nPizza: " + pizza3);
        return buffer.toString();
    }

    

}
