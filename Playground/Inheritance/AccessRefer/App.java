package Playground.Inheritance.AccessRefer;

public class App {
    public static void main(String[] args) {
        Base p = new Derived();
        Derived ch = new Derived();

        System.out.println(ch.get());
        // System.out.println(p.get());
        // The method get() from the type Parent is not visible
    }
}


class Base {
    private int get(){
        return 10;
    }
}


class Derived extends Base {
    public int get(){
        return 20;
    }
}
