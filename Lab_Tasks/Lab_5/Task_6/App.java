package Lab_Tasks.Lab_5.Task_6;

public class App {
    public static void main(String[] args) {
        // Pizza pizza = new Pizza(Size.small, 1, 1, 1);
        // System.out.println((pizza.calculateCost()));
        // System.out.println(pizza);

        PizzaOrder pizzaOrder = new PizzaOrder(
            new Pizza(
                Size.large,
                1, 
                2,
                3
            ), 
            new Pizza(
                Size.medium, 
                1, 
                2, 
                1
            )
        );

        System.out.println(pizzaOrder);
        System.out.println(pizzaOrder.calculateCost());
    }
}
