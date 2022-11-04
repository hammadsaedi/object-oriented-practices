package Playground.Inheritance.StaticOverRiding;

public class App {
    public static void main(String[] args) {
        Parent p = new Child(19);
        System.out.println(p.getX());
        System.out.println(p.add(1, 2));

        Child c = new Child(19);
        System.out.println(c.add(1, 2));
    }
}
