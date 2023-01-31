package Lab_Tasks.Lab_13.Task_5;

public class Operation {
    public static <T> void printArray(T[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static <T extends Number> Double average(T[] array) {
        Double average = 0.0;
        for (int i = 0; i < array.length; i++) {
            average += (array[i].doubleValue() / array.length);
        }
        return average;
    }

    public static <T extends Comparable<T>> T findLargest(T[] array) {
        T largest = array[0];
        for (int i = 0; i < array.length; i++) {
            int x = array[i].compareTo(largest);
            if (x == 1)
                largest = array[i];
        }
        return largest;
    }
}
