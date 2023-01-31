package Lab_Tasks.Lab_13.Task_6;

import java.util.ArrayList;

public class Stack<T> {
    private ArrayList<T> list;

    public Stack() {
        list = new ArrayList<>();
    }

    public void push(T e) {
        list.add(e);
    }

    public T pop() {
        return list.remove(list.size() - 1);
    }

    public T peek() {
        return list.get(list.size() - 1);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}