package Playground.Inheritance.Human;

public class Mammalia extends Chordata {
    
    Mammalia(){
        System.out.println("Mammalia Instantiated!");
    }

    @Override
    String getName(){
        super.getName();
        System.out.println("Mammalia");
        return "Mammalia";
    }
}
