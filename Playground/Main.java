package Playground;

public class Main {
    public static void main(String[] args) {
        // The constructor Single() is not visibleJava(134217859)
        // Single single = new Single();

        Single single = Single.getInstance();
        System.out.println(single.getDob());

        try {
            Single second = Single.getInstance();
            System.out.println(second);
        } catch (RuntimeException rte) {
            System.out.println(rte);
        }

        for (int i = 0; i < 1000000; i++) {
            Destructor ds = new Destructor();
        }
    }
}
