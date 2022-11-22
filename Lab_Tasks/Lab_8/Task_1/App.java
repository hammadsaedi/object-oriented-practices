package Lab_Tasks.Lab_8.Task_1;

public class App {
    public static void main(String[] args) {
        Shapes[] shapes = new Shapes[10];

        for (int i = 0; i < shapes.length; i += 2) {
            shapes[i] = new Circle(i);
            shapes[i + 1] = new Rectangle(i, i);
        }

        System.out.println("Area");
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i].area());
        }

        System.out.println("Parameters and Circumference");
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof Circle) System.out.println(((Circle) shapes[i]).circumference());
            if (shapes[i] instanceof Rectangle) System.out.println(((Rectangle) shapes[i]).parameter());
        }
    }
}
