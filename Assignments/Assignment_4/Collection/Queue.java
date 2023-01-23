package Assignments.Assignment_4.Collection;

public interface Queue<T> extends Collection<T> {
    /**
     * Enqueue Element in Queue
     * 
     * @param e
     */
    void push(T e);

    /**
     * Get Front element from Queue
     * 
     * @return first element
     */
    T front();

    /**
     * Dequeue from Queue
     * 
     * @return first element
     */
    T poll();
}