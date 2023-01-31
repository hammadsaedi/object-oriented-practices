package Lab_Tasks.Lab_13.Task_4;

import java.util.ArrayList;
import java.util.Random;

public class DrawRandom<T> {
    ArrayList<T> list = new ArrayList<>();

    public void add(T obj) {
        list.add(obj);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public T drawItem() {
        if (isEmpty())
            return null;
        int index = (new Random()).nextInt(list.size());
        return list.remove(index);
    }
}
