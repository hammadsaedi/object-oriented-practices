package Playground.Inheritance.Human;

public class Animalia extends Eukarya {
    Animalia(){
        System.out.println("Animalia Instantiated!");
    }
    
    @Override
    String getName(){
        super.getName();
        System.out.println("Animalia");
        return "Animalia";
    }
}
