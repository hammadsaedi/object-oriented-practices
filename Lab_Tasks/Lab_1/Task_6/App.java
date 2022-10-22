package Lab_Tasks.Lab_1.Task_6;

public class App {
    

    public static void main(String[] args) {
        Point point1 = new Point(1, 1);
        Point point2 = new Point(2, 2);

        System.out.println(point1.distance(point2));

        System.out.println(point1.distance(point1));


        System.out.println(point1);
        point1.setX(2);
        System.out.println(point1);

    }
}
