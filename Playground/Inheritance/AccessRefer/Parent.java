package Playground.Inheritance.AccessRefer;

public class Parent {
    private int get(){
        return 10;
    }

    public static void main(String[] args) {
        Parent p = new Child();
        Child c = new Child();
        System.out.println(c.get());
        System.out.println(p.get());
    }
}


// Consider it as separate file?
class Child extends Parent {
    // @Override
    public int get(){
        return 20;
    }

    // public int getSome(){
    //     return super.get();
    // } // The method get() from the type Parent is not visibleJava(67108965)


    // cannot make it private
    // WTH
}
