package MidTerm;

import java.util.Objects;

public class Order {
    private Item[] items = new Item[30];
    private Customer customer;
    private double totalBill;

    public Order (Customer customer){
        this.customer = new Customer(customer.getName(), customer.getAge(), customer.getCustomerId(), customer.getPassword());
    }

    public void takeOrder(String name) {
        double price = 0;
        if ((price = new Shop("Name").buy(name)) >= 0) totalBill += price;
        addItem(name, price);
    }

    public double getTotalBill(){
        // applyDiscount();
        return totalBill;
    }

    public void applyDiscount(){
        // System.out.println(customer);
        if (new Shop("NULL").findCustomer(customer.getCustomerId())){
            totalBill -= (totalBill / 10);
        }
    }

    private void addItem(String name, double price){
        int index = getIndex(items);
        if (index >= items.length) throw new RuntimeException("Item Buffer is Full.");
        items[index] = new Item(Integer.toString(index + 1), name, price);
    }

    private int getIndex(Object[] obj){
        int i = 0;
        for (; i < obj.length; i++) {
            if (Objects.isNull(obj[i])) break;
        }
        return i;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Order [ customer=" + customer + ", ");
        for (int i = 0; i < items.length; i++) {
            if (Objects.nonNull(items[i])) builder.append(items[i] + "\n");
        }
        builder.append(" ]");
        return builder.toString();
    }
}
