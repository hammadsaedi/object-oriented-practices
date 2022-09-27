package Lab_2.Task_3;

public class App {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle();
        System.out.println(rec1);

        Rectangle rec2 = new Rectangle(23, 4);

        System.out.println(rec1.checkSquare());
        System.out.println(rec2.checkSquare());

        rec1.setL(3);
        System.out.println(rec1);

        System.out.println(rec1.calculateArea());
    }
}
