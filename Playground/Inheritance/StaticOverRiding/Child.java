package Playground.Inheritance.StaticOverRiding;

public class Child extends Parent {
    private int x;

    Child(int x) {
        super(x);
    }
    
    public static int add(int x, int y){
        return x + y + 1;
    }

    // // This instance method cannot override the static method from ParentJava(67109270)
    // public int add(int x, int y){
    //     return x + y + 1;
    // }
}
