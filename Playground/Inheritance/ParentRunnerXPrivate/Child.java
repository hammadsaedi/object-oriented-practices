package Playground.Inheritance.ParentRunnerXPrivate;

public class Child extends Parent {
    private void foo(){
        System.out.println("Child.foo()");
    }

    public static void main(String[] args) {
        Child c = new Child();
        Parent p = new Parent();

        // p.foo();
        c.foo();
    }
}
