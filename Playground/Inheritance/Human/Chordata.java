package Playground.Inheritance.Human;

public class Chordata extends Animalia {
    
    Chordata(){
        System.out.println("Chordata Instantiated!");
    }

    @Override
    String getName(){
        super.getName();
        System.out.println("Chordata");
        return "Chordata";
    }
}
