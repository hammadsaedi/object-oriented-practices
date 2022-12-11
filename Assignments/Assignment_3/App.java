package Assignments.Assignment_3;

public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
        Circle c1 = new Circle (true,"Blue",2.5,5);
        Circle c2 = new Circle (false,"red",1.5,10);
        Rectangle r1 = new Rectangle(true,"Blue",2.5,4,5);
        Rectangle r2 = new Rectangle(false,"red",3.6,6,5);
        Rectangle r3 = new Rectangle(true,"green",4.5,1,5);

        Drawing d = new Drawing();


        d.add(c1);
        d.add(c2);
        d.add(r1);
        d.add(r2);
        d.add(r3);


        System.out.println("Total Area of Drawing is " + d.area());
        System.out.println("Number of Filled Figures in the drawing is "+d.filledObjects());


        r1 = new Rectangle(false, "Blue", 1, 2, 3);
        r2 = new Rectangle(false, "Blue", 1, 3, 2);

        if (r1.compareTo(r2) == 0) {
            System.out.println("EQUAL VOLUME!");
        }

        
        c1 = new Circle(false, "WHITE", 1, 1);
        r3 = new Rectangle(false, "Blue", 1, 1, Math.PI);
        
        if (c1.compareTo(r3) == 0) {
            System.out.println("EQUAL VOLUME!");
        }


        Circle circle = (Circle) c1.clone();
        System.out.println(circle);
        System.out.println(c1);
        circle.setColor("BLUE");
        System.out.println(circle);
        System.out.println(c1);
    }
}
