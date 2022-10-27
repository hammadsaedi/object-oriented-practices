package Playground.Inheritance.Human;

public class Hominidae extends Primates {
    
    Hominidae(){
        System.out.println("Hominidae Instantiated!");
    }

    @Override
    String getName(){
        super.getName();
        System.out.println("Hominidae");
        return "Hominidae";
    }
}
