package Playground.Inheritance.StaticOverRiding;

public class Parent {
    private int x;

    Parent(int x){
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public static int add(int x, int y){
        return x + y;
    }
}
