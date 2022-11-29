package MidTerm;

import java.util.Objects;

public class Shop {
    private String owner;
    private static Item[] items = new Item[100];;
    private static Customer[] customers =  new Customer[100];;

    public Shop (String owner){
        this.owner = owner;
    }

    public void addItem(Item item){
        int index = getIndex(items);
        if (index >= items.length) throw new RuntimeException("Item Buffer is Full.");
        items[index] = new Item(item.getId(), item.getName(), item.getPrice());
    }
    
    public void addCustomer(Customer customer){
        int index = getIndex(items);
        if (index >= customers.length) throw new RuntimeException("Item Buffer is Full.");
        customers[index] = new Customer(customer.getName(), customer.getAge(), customer.getCustomerId(), customer.getPassword());
    }

    public double buy(String name){
        int i = 0;
        double price = -1;
        for (; i < items.length; i++) {
            if (Objects.nonNull(items[i]) && items[i].getName().equals(name)){
                price = items[i].getPrice();
                items[i] = null;
                System.gc();
                break;
            } 
        }
        return price; 
    }

    boolean findCustomer(String customerId){
        int i = 0;
        for (; i < customers.length; i++) {
            if (Objects.nonNull(customers[i]) && customers[i].getCustomerId().equals(customerId)) {
                return true;
            }
        }
        return false;
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
        builder.append("Shop [owner=" + owner + "Item: \n");
        for (int i = 0; i < items.length; i++) {
            if(Objects.nonNull(items[i])) builder.append(items[i] + "\n");
        }
        builder.append("Customer: \n");
        for (int i = 0; i < customers.length; i++) {
            if(Objects.nonNull(customers[i])) builder.append(customers[i] + "\n");
        }
        builder.append(" ]");

        return builder.toString();
    }
}
