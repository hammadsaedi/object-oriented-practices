package Playground.Destructor;

public class Main {
    public static void main(String[] args) {

        // Instantiate so many reference variable; Objects Removed by garbage Collector in heap; As there is no reference to them 
        // for (int i = 0; i < 1000000; i++) {
        //     Destructor ds = new Destructor();
        // }

        System.out.println("Here We Go: ");
        Destructor ds = new Destructor();

        System.out.println(ds.getClass());

        ds = null; // Nullified

        // System.gc();
        // Runtime.getRuntime().gc();

        // Up to 2 GB LOL
        System.out.println(Runtime.getRuntime().maxMemory());
        System.out.println(Runtime.getRuntime().availableProcessors()); // 8! O Yeah!
        System.out.println(Runtime.getRuntime().freeMemory());
    }
}
