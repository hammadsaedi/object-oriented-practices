package Playground.staticBlock;

public class block {
    static { // Run when class is loaded in memory first time
        System.out.println("Static Block Called");
    }

    {
        System.out.println("Non Static Block Called");
    }
    block(){
        System.out.println("Constructor Called");
    }
}
