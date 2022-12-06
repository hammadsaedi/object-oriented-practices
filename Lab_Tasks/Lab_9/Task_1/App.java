package Lab_Tasks.Lab_9.Task_1;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hammad Saeedi");
        list.add(list.get(0));
        list.set(1, list.get(1));
        System.out.println(list);
        list.remove("Hammad Saeedi");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        list.add("Hammad Saeedi");
        list.clear();
        System.out.println(list);
        list.add("Hammad Saeedi");
        ArrayList<String> list2 = (ArrayList<String>)list.clone();
        list2.add("Java");
        System.out.println(list);
        System.out.println(list2);
        

    }
}
