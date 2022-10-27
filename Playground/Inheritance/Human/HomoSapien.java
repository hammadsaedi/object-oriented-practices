package Playground.Inheritance.Human;

public class HomoSapien extends Homo {
    
    HomoSapien(){
        System.out.println("HomoSapien Instantaited!");
    }

    @Override
    String getName(){
        super.getName();
        System.out.println("HomoSapien");
        return "HomoSapien";
    }
}
