package Lab_Tasks.Lab_7.Task_2;

public class App {
    public static void main(String[] args) {
        Comedy comedy = new Comedy("Her Love", 19);
        Drama drama = new Drama("Her Love", 19);
        System.out.println(comedy.equals(drama));
    }
}
