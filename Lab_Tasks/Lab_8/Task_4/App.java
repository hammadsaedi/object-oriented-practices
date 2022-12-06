package Lab_Tasks.Lab_8.Task_4;

import Lab_Tasks.Lab_3.Task_1.Rectangle;

public class App {
    public static void main(String[] args) {
        NameCollection collection = new NameCollection();

        for(int i = 0; i < 10; i++){
            collection.push("Hello " + i);
        }
        
        System.out.println(collection);

        int i = 0;
        while (collection.hasNext(i)){
            System.out.println(collection.getNext(i++));
        }
    }
}
