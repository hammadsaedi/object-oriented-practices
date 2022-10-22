package Lab_Tasks.Lab_1.Task_2;

public class App {

    public static void main(String[] args) {
        Time time = new Time(10, 10, 10, 20, 9, 2022);
        
        System.out.println(time);

        time.setHour(11);

        System.out.println(time);
    }
}
