package Playground.Inheritance.Parse;

public class App {
    public static void main(String[] args) {
        Parent ch = new Child(19);
        System.out.println(ch.num); // print 0

        // Use Only Inherited method; Not unique one ;)

        Child ch2 = new Child(19);
        System.out.println(ch2.num); // print 19

        System.out.println(ch.getNum()); // print 19
        System.out.println(ch2.getNum()); // print 19
    }
}
