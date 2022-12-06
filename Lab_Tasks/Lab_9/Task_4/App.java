package Lab_Tasks.Lab_9.Task_4;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(null);

        try {
            System.out.println(list.get(1) + 3);
        } catch (NullPointerException exception){
            System.out.println(exception);
        }

        System.out.println(list);

        list.add(Integer.valueOf(4));
        list.add(new Integer(12));

        System.out.println(list);

        int i = 1;
        System.out.println(i += list.get(0));
    }
}
