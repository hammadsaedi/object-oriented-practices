package Assignments.Assignment_4.Collection;

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        System.out.println(list);
        list.insert(0, 0);
        System.out.println(list);
        list.insert(5, 5);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        list.remove(4);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);

        Queue<Integer> queue = list;
        System.out.println(queue.front());

        Stack<Integer> stack = list;
        System.out.println(stack.peek());

    }
}
