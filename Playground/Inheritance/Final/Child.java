package Playground.Inheritance.Final;

public class Child extends Parent {
    final int x = 6;

    // Cannot override the final method from ParentJava(67109265)
    // final int getX(){
    //     return x;
    // }

    final int getXV2(){
        return x;
    }
}
