package Playground.Inheritance.ParentRunnerXPrivate;

public class Parent {
    private void fun(){
        System.out.println("Parent.fun()");
    }

    private void foo(){
        System.out.println("Parent.foo()");
    }

    public static void main(String[] args) {
        Child c = new Child();
        Parent p = new Parent();

        p.fun();
        // c.fun();
    }
}
