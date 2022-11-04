package Playground.staticBlock;

class Main {
    final static int i;
    final int j;

    static {
        System.out.println("Main.enclosing_method()");
        i = 0;
    }

    Main(){
        j = 19;
    }
    
    public static void main(String[] args) {
        foo();
    }

    public static void foo() {
        System.out.println("Main.foo()");
    }
}