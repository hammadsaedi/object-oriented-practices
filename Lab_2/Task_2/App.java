package Lab_2.Task_2;

public class App {
    public static void main(String[] args) {
        Quadratic eq1 = new Quadratic();
        System.out.println(eq1);
        
        Quadratic eq2 = new Quadratic(0, 2, 4);
        System.out.println(eq2);

        eq1.setA(3);
        eq1.setB(4);
        eq1.setC(56);
        System.out.println(eq1);

        System.out.println(eq2.getDisc());
        System.out.println(eq2.isDiscGreaterThan100());
    }
}
