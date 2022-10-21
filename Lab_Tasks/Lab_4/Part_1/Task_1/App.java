package Lab_Tasks.Lab_4.Part_1.Task_1;

public class App {
    public static void main(String[] args) {
        Point[] points = new Point[10];
        
        for (int i = 0; i < points.length; i++) {
            System.out.println(points[i]);    
        }

        for (int i = 0; i < 5; i++) {
            points[i] = new Point();
        }

        for (int i = 5; i < 10; i++) {
            points[i] = new Point(i, 2*i);
        }

        for (int i = 0; i < points.length; i++) {
            System.out.println(points[i]);    
        }

        for (int i = 0; i < 5; i++) {
            points[i].setY(19);
        }

        for (int i = 5; i < 10; i++) {
            points[i].move(3, 4);
        }

        for (int i = 0; i < points.length; i++) {
            System.out.println(points[i]);    
        }
    }
}
