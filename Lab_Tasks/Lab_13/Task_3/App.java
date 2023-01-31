package Lab_Tasks.Lab_13.Task_3;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(99);
        list.add(43);
        list.add(32);

        Math<Integer> math = new Math<>(list);

        System.out.println(math.standardDeviation());
    }
}
