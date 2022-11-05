package Playground.Inheritance.Final;

public class Parent {
    final int x = 6;

    final int getX(){
        return x;
    }


    private final int getXV2(){
        return x;
    }

    // private method cannot be over ridden
    // they just got hidden
    
}
