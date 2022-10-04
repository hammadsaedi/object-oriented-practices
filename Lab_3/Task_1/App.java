package Lab_3.Task_1;

public class App {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(1, 2);
        
        System.out.println(r1);
        System.out.println(r2);

        System.out.println(r1.area());
        System.out.println(r2.area());

        System.out.println(r1.compare(r2));

        r1.setWidth(2);
        System.out.println(r1.compare(r2));

        r1.setWidth(3);
        System.out.println(r1.compare(r2));
    }
}
