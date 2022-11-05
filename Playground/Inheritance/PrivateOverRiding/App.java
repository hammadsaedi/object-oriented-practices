package Playground.Inheritance.PrivateOverRiding;

public class App {
    public static void main(String[] args) {
        Child ch = new Child();
        Parent chP = new Child();

        ch.setX(1);
        System.out.println(ch.getX());

        ch.setX(3);
        System.out.println(ch.getX());

        chP.setX(3);
        System.out.println(chP.getX());
    }
}
