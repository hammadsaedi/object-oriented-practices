package Lab_Tasks.Lab_3.Task_2;

public class App {
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(1, 2);
        
        p2.setY(p1.getX());

        System.out.println(p1);
        System.out.println(p2);
    }
}
