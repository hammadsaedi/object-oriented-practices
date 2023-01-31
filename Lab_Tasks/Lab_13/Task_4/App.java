package Lab_Tasks.Lab_13.Task_4;

public class App {
    public static void main(String[] args) {
        DrawRandom<Integer> app = new DrawRandom<>();

        app.add(14);
        app.add(45);
        app.add(59);
        app.add(90);

        System.out.println(app.drawItem());
    }
}
