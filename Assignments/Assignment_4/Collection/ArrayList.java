package Assignments.Assignment_4.Collection;

public class ArrayList<T> implements Stack<T>, Queue<T> {
    private Object[] array;
    private int capacity;
    private int pointer;

    /**
     * Instantiate ArrayList with Initial Capacity of 10 elements
     */
    public ArrayList() {
        this(10);
    }

    /**
     * Instantiate ArrayList
     * 
     * @param initialCapacity
     */
    public ArrayList(int initialCapacity) {
        if (initialCapacity < 0)
            throw new RuntimeException("Capacity can not be negative.");
        array = new Object[capacity = initialCapacity];
        pointer = -1;
    }

    /**
     * Insert Element at given index
     * 
     * @param e
     * @param index
     * @throws IndexOutOfBoundsException with negative index or index higher than
     *                                   next possible writing position is passed
     */
    public void insert(T e, int index) {
        if (index < 0 || index > pointer + 1)
            throw new IndexOutOfBoundsException();
        if (isFull())
            grow();
        shiftRight(index);
        array[index] = e;
    }

    /**
     * Insert Element at the end of list
     * 
     * @param e element
     */
    public void append(T e) {
        insert(e, pointer + 1);
    }

    /**
     * Insert Element at the end of List
     * Push on the Stack or Enqueue in Queue
     * 
     * @param e element
     */
    @Override
    public void push(T e) {
        insert(e, pointer + 1);
    }

    /**
     * Remove Element from given index
     * 
     * @param index
     * @return removed element
     * @throws IndexOutOfBoundsException
     */
    public T remove(int index) {
        if (index < 0 || index > pointer)
            throw new IndexOutOfBoundsException();
        @SuppressWarnings("unchecked")
        T removed = (T) array[index];
        shiftLeft(index);
        return removed;
    }

    /**
     * Remove Element from end of list
     * Pop Element from Stack
     * 
     * @return last element
     */
    @Override
    public T pop() {
        return remove(pointer);
    }

    /**
     * Remove element from start of list
     * Poll Element from Queue
     * 
     * @return first element
     */
    @Override
    public T poll() {
        return remove(0);
    }

    /**
     * Get Element at given index
     * 
     * @param i
     * @return element
     * @throws IndexOutOfBoundsException with negative index or index higher than
     *                                   next possible writing position is passed
     */
    @SuppressWarnings("unchecked")
    public T get(int i) {
        if (i < 0 || i > pointer)
            throw new IndexOutOfBoundsException();
        return (T) array[i];
    }

    /**
     * Get Last element in List
     * Top of Stack
     * 
     * @return last element
     */
    @Override
    public T peek() {
        return get(pointer);
    }

    /**
     * Get First element from List
     * Front of Queue
     * 
     * @return first element
     */
    @Override
    public T front() {
        return get(0);
    }

    /**
     * Check if List is Empty
     * 
     * @return true if list is empty
     */
    @Override
    public boolean isEmpty() {
        return pointer == -1;
    }

    /**
     * Get size of list
     * 
     * @return Size of list
     */
    @Override
    public int size() {
        return pointer + 1;
    }

    /**
     * Check if Array is Full
     * 
     * @return true if array out of capacity
     * @apiNote dev use to decide if it is required to grow array
     */
    private boolean isFull() {
        return pointer >= capacity - 1;
    }

    /**
     * Grow array Twice by Capacity
     * 
     * @apiNote dev use when array if full
     */
    private void grow() {
        Object[] buffer = new Object[capacity * 2];
        for (int i = 0; i < pointer; i++) {
            buffer[i] = array[i];
        }
        array = buffer;
        capacity *= 2;
    }

    /**
     * Shift all element towards left till index
     * 
     * @param index
     * @apiNote dev use it is required to remove element
     */
    private void shiftLeft(int index) {
        for (int i = index; i < pointer; i++) {
            array[i] = array[i + 1];
        }
        pointer--;
    }

    /**
     * Shift all element towards right till bound
     * 
     * @param bound
     * @apiNote dev use it is required to add element
     */
    private void shiftRight(int bound) {
        for (int i = pointer; i >= bound; i--) {
            array[i + 1] = array[i];
        }
        pointer++;
    }

    /**
     * String representation of List
     * 
     * @return String
     */
    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("ArrayList [");
        for (int i = 0; i < pointer; i++) {
            buffer.append(array[i] + ", ");
        }
        buffer.append(array[pointer] + "]");
        return buffer.toString();
    }
}
