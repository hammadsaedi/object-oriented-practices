package Playground.Inheritance.Human;

public class Homo extends Hominidae {
    
    Homo(){
        System.out.println("Homo Instantiated!");
    }

    @Override
    String getName(){
        super.getName();
        System.out.println("Homo");
        return "Homo";
    }
}
