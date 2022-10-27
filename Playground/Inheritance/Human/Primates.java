package Playground.Inheritance.Human;


public class Primates extends Mammalia {
    Primates(){
        System.out.println("Primates Instantiated!");
    }

    @Override
    String getName(){
        super.getName();
        System.out.println("Primates");
        return "Primates";
    }
}
