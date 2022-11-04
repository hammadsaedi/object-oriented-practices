package Playground.Inheritance.PrivateOverRiding;

public class Outer {
    private int x;

    private int getX(){
        return x;
    }

    // private static void fm(){
    //     System.out.println("Outer.fm()");
    // } 

    class Inner extends Outer {
        private int getX(){
            return x + 1;
        }

        // void fm(){
        //     System.out.println("Outer.Inner.fm()");
        // }
    }


    public static void main(String[] args) {
        Outer enclosing = new Outer(); 
        
        Inner one = enclosing.new Inner();
        Outer two = enclosing.new Inner();

        System.out.println(one.getX());
        // Run method of child class

        System.out.println(two.getX()); // Method is hidden not Over-Ridden
        // Run method of Parent Class


        // one.fm();
        // two.fm();
    }
}
