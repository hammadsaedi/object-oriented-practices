package Lab_Tasks.Lab_13.Task_6;

public class App {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(3);
        stack.push(13);
        stack.push(41);
        stack.push(4);
        stack.push(51);
        stack.push(15);

        System.out.println(stack.pop());
    }
}
