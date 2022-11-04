package Playground.Interfaces;

public interface Car {
    int x = 0;
    
    static int foo(){
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(foo());
        // bar();
    }

    private void bar(){}

    private void buzz(){
    }
}
