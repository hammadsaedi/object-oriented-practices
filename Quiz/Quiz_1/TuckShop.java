package Quiz.Quiz_1;

import java.util.Arrays;
import java.util.Objects;

public class TuckShop {
    private String owner;
    private String[] Food_Items = new String[100];
    private double[] price = new double[100]; 
    private int[] quantity = new int[100];

    public TuckShop(){
        this("N/A", new String[0], new double[0], new int[0]);
    }

    public TuckShop(final TuckShop shop){
        this(shop.owner, shop.Food_Items, shop.price, shop.quantity);
    }

    public TuckShop(final String owner, final String[] Food_Items, final double[] price, final int[] quantity) {
        if (Objects.isNull(owner))
            throw new RuntimeException("Name can not be null!");
        this.owner = owner;

        if (Food_Items.length != quantity.length && Food_Items.length != price.length)
            throw new RuntimeException("Missing Quantity or Price data for Food Item!");
        
        if (Food_Items.length > this.Food_Items.length) {
            final int difference = Food_Items.length - this.Food_Items.length;
            final int index = this.Food_Items.length;
            growSize(difference);
            for (int i = index; i < this.Food_Items.length; i++) {
                this.Food_Items[i] = Food_Items[i];
            }
    
            for (int i = index; i < this.price.length; i++) {
                this.price[i] = price[i];
            }
    
            for (int i = index; i < this.quantity.length; i++) {
                this.quantity[i] = quantity[i];
            }
        } 
        else {
            final int difference = this.Food_Items.length - Food_Items.length;

            for (int i = 0; i < Food_Items.length; i++) {
                this.Food_Items[i] = Food_Items[i];
            }
    
            for (int i = 0; i < price.length; i++) {
                this.price[i] = price[i];
            }
    
            for (int i = 0; i < quantity.length; i++) {
                this.quantity[i] = quantity[i];
            }

            if (difference > 0){
                shrinkSize(difference);
            }
        }
        
    }
    
    public String getOwner() {
        return owner;
    }

    public void setOwner(final String owner) {
        if (Objects.nonNull(owner))
            this.owner = owner;
    }

    public TuckShop compareTwoShops(final TuckShop shop) {
        if (this.Food_Items.length > shop.Food_Items.length) {
            return this;
        } else if (this.Food_Items.length < shop.Food_Items.length) {
            return shop;
        }
        return null;
    }

    public boolean compareOwner(final TuckShop shop){
        if (this.owner.equals(shop.owner)) return true;
        return false;
    }

    public void addFoodItem(final String item, final double price, final int quantity){
        System.out.println(this.Food_Items.length);
        growSize(1);
        System.out.println(this.Food_Items.length);

        this.Food_Items[this.Food_Items.length - 1] = item;
        this.price[this.price.length - 1] = price;
        this.quantity[this.quantity.length - 1] = quantity;

        // System.out.println(Arrays.toString(this.Food_Items));
    }

    public Item buy(final String item, final int quantity){
        if (Objects.nonNull(item)  && quantity > 0) {
            final int index = searchItem(item);
            if (index >= 0 && this.quantity[index] <= quantity){
                --this.quantity[index];
                final Item buffer = new Item(this.Food_Items[index], this.price[index], this.quantity[index]);
                if (this.quantity[index] == 0){
                    delete(index);
                }
                return buffer;
            }
        }
        return new Item(null, 0, 0);
    }
    
    @Override
    public String toString() {
        return "TuckShop [Owner: " + owner + ", Food Items: " + Arrays.toString(Food_Items) + ", Price: "
                + Arrays.toString(price) + ", Quantity: " + Arrays.toString(quantity) + "]";
    }

    private void growSize(int size){
        size += Food_Items.length;
        
        final String Food_Items[] = new String[size];
        final double price[] = new double[size];
        final int quantity[] = new int[size];

        // Copy Existing Items
        for (int i = 0; i < this.Food_Items.length; i++) {
            Food_Items[i] = this.Food_Items[i];
        }

        for (int i = 0; i < this.price.length; i++) {
            price[i] = this.price[i];
        }

        for (int i = 0; i < this.quantity.length; i++) {
            quantity[i] = this.quantity[i] ;
        }

        // Updating 
        this.Food_Items = Food_Items;
        this.price = price;
        this.quantity = quantity;
    }

    private void shrinkSize(final int size){
        final String Food_Items[] = new String[this.Food_Items.length - size];
        final double price[] = new double[ this.price.length - size];
        final int quantity[] = new int[this.quantity.length - size];

        // Copy Existing Items
        for (int i = 0; i < Food_Items.length; i++) {
            Food_Items[i] = this.Food_Items[i];
        }

        for (int i = 0; i < price.length; i++) {
            price[i] = this.price[i] ;
        }

        for (int i = 0; i < quantity.length; i++) {
            quantity[i] = this.quantity[i];
        }

        // Updating 
        this.Food_Items = Food_Items;
        this.price = price;
        this.quantity = quantity;
    }

    private int searchItem(final String item){
        for (int i = 0; i < Food_Items.length; i++) {
            if (Food_Items[i] == item) return i;
        }
        return -1;
    }

    
    private void delete(final int index){
        for (int i = quantity.length - 1; i > index; i--) {
            this.quantity[i - 1] = this.quantity[i];
        }
        for (int i = price.length - 1 ; i > index; i--) {
            this.price[i - 1] = this.price[i];
        }
        for (int i = Food_Items.length - 1; i > index; i--)` {
            this.Food_Items[i - 1] = this.Food_Items[i];
        }
        shrinkSize(1);
    } 

}


