package Lab_Tasks.Lab_2.Task_4;

public class App {
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(2, 3);

        System.out.println(p1.checkOrigin());
        p1.move();
        System.out.println(p1.checkOrigin());

        System.out.println(p2);
        p2.move(2, 4);
        System.out.println(p2);
    }
}
