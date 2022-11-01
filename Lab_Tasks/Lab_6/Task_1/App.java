package Lab_Tasks.Lab_6.Task_1;

public class App {
    public static void main(String[] args) {
        Laptop pc = new Laptop();
        System.out.println(pc);

        pc = new Laptop(1, 2, 3, 4, 5, 6, 7, 8);
        System.out.println(pc);
    }
}
