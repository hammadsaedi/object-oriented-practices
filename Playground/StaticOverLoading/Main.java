package Playground.StaticOverLoading;

public class Main {

    int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    // // Duplicate method add(int, int, int) in type MainJava(67109219)
    // int add(int a, int b, int c) {
    //     return a + b + c;
    // }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.add(1, 2));

        System.out.println(main.add(1, 2, 3));

    }
}
