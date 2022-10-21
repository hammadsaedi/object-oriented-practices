package Task_4;

public class App {
    
    public static void main(String[] args) {
        Rectangle shape = new Rectangle(1.3, 1.6);

        System.out.println("Area: " + shape.area());
        System.out.println("Parameter: " + shape.parameter());

        System.out.println(shape);

        shape.setLength(1);

        System.out.println(shape);

    }
}
