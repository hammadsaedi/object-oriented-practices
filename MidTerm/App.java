package MidTerm;

public class App {
    public static void main(String[] args) {
        Shop shop = new Shop("Hammad");

        Customer customer = new Customer("Hammad", 19, Integer.toString(2), "%$^");
        
        Order order = new Order(customer);

        for (int i = 0; i < 10; i++) {
            shop.addCustomer(new Customer("Hammad", 19, Integer.toString(i + 1), "%$^")); 
        }

        shop.addCustomer(customer);

        shop.addItem(new Item("1", "Laptop", 10));
        shop.addItem(new Item("2", "PC", 10));
        shop.addItem(new Item("3", "Camera", 10));
        shop.addItem(new Item("4", "Bottle", 10));
        shop.addItem(new Item("5", "Mouse", 10));
        shop.addItem(new Item("6", "Keyboard", 10));
        shop.addItem(new Item("7", "Keys", 10));
        shop.addItem(new Item("8", "Wallet", 10));
        shop.addItem(new Item("9", "Coin", 10));
        shop.addItem(new Item("10", "Laptop", 10));

        System.out.println(order);

        order.takeOrder("Laptop");
        order.takeOrder("PC");
        order.takeOrder("Coin");

        System.out.println(order.getTotalBill());

        order.applyDiscount();

        System.out.println(order.getTotalBill());
    }
}
