package Quiz.Quiz_1;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        // TuckShop shop = new TuckShop("Hammad", new String[]{"Apple", "Banana"}, new double[]{100, 1000}, new int[]{1, 1});
        // System.out.println(shop);
        // shop.buy("Apple", 1);
        // System.out.println(shop);
        // shop.addFoodItem("Apple", 100, 1);
        // shop.buy("Watch", 1);
        // System.out.println(shop);
        // System.out.println(Arrays.toString(shop.getdata()));

        TuckShop shop = new TuckShop();
        shop.addFoodItem("Apple", 0, 1);
        System.out.println(shop);
        shop.buy("Apple", 1);
        System.out.println(shop);
        shop.addFoodItem("Apple", 0, 1);
        System.out.println(shop);

        TuckShop shopV2 = new TuckShop(shop);

        System.out.println(shopV2.compareOwner(shop));
        System.out.println(shopV2.compareTwoShops(shopV2));

        shop.setOwner("Hammad Saeedi");
        System.out.println(shopV2.compareOwner(shop));

    }
}
