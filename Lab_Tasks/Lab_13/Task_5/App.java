package Lab_Tasks.Lab_13.Task_5;

import Lab_Tasks.Lab_8.Task_1.Rectangle;

public class App {
    public static void main(String[] args) {
        Rectangle[] rec = new Rectangle[] { new Rectangle(1, 2), new Rectangle(2, 3) };
        Operation.printArray(rec);

        System.out.println(Operation.findLargest(new Integer[] { 1, 2, 3, 4, 5 }));

        System.out.println(Operation.findLargest(rec));
    }
}
