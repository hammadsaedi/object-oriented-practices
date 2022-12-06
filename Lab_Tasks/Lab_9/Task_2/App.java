package Lab_Tasks.Lab_9.Task_2;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<News> list = new ArrayList<>();
        
        list.add(new News("1", "Hammad Saeedi", "Trump is re-instantiated!"));
        list.add(new News("2", "Muhammad", "Layoff are coming!"));
        list.add(new News("123", "Ali", "Open Source will help devs!"));

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getNewsEditor().equals("Ali")) System.out.println(list.get(i));
        }

        for (int i = 0; i < list.size(); i++){
            if (list.get(i).getNewsId().equals("123")) list.remove(i);
        }

        System.out.println(list);

        News news = new News("1", "Hammad Saeedi", "Trump is re-instantiated!");
        
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).equals(news)) {
                System.out.println("Index: " + i);
                break; 
            }
        }
    }
}
