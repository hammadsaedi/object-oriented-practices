package Playground.Self_Inheritance;

public class Child extends Parent {
    private String name;

    public Child(){
        System.out.println("Child.Child()");
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
