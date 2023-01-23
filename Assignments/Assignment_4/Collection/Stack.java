package Assignments.Assignment_4.Collection;

public interface Stack<T> extends Collection<T> {
    /**
     * Push Element on the stack
     * 
     * @param e
     */
    void push(T e);

    /**
     * Pop element from Stack
     * 
     * @return top of stack
     */
    T pop();

    /**
     * Get Top of stack
     * 
     * @return top of stack
     */
    T peek();
}
