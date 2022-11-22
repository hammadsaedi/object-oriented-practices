package Lab_Tasks.Lab_8.Task_3;

public class App {
    public static void main(String[] args) {
        Compare item1 = new InventoryItem("Laptop", 12);
        Compare item2 = new InventoryItem("Laptop", 12);

        String obj = "Hello World";

        System.out.println(item1.compareObject(item2));
        System.out.println(item1.compareObject(obj));
    }
}
