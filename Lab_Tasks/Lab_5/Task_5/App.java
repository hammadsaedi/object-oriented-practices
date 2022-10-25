package Lab_Tasks.Lab_5.Task_5;

import Lab_Tasks.Lab_1.Task_7.Circle;
import Lab_Tasks.Lab_1.Task_4.Rectangle;

public class App {
    public static void main(String[] args) {
        GeometricCollection geometricCollection = new GeometricCollection();
        System.out.println(geometricCollection);

        GeometricCollection gc = new GeometricCollection(
            new Circle[]{
                new Circle(1), 
                new Circle(2), 
                new Circle(2), 
                new Circle(3)
            } , 
            new Rectangle[]{
                new Rectangle(1, 1), 
                new Rectangle(1, 2)
            }
        );

        GeometricCollection gc2 = new GeometricCollection(
            new Circle[]{
                new Circle(1)
            } , 
            new Rectangle[]{
                new Rectangle(1, 1)
            }
        );

        System.out.println(gc);

        System.out.println(gc.area());
        System.out.println(geometricCollection.area());
        System.out.println(gc2.area());
        
    }
}
