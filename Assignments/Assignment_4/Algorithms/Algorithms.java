package Assignments.Assignment_4.Algorithms;

import java.util.Arrays;

public class Algorithms {
    public static <T extends Comparable<T>> void bubbleSort(T[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) == 1) {
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
    }

    public static <T extends Comparable<T>> void selectionSort(T[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].compareTo(array[min]) == -1)
                    min = j;
            }
            if (min != i) {
                T temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }
    }

    public static <T extends Comparable<T>> void insertionSort(T[] array) {
        for (int i = 1; i < array.length; i++) {
            T temp = array[i];
            int j = i;
            while (j > 0 && temp.compareTo(array[j - 1]) == -1) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = temp;
        }
    }

    public static <T extends Comparable<T>> void mergeSort(T[] array) {
        sort(array, 0, array.length - 1);
    }

    private static <T extends Comparable<T>> void sort(T[] array, int start, int end) {
        if (end <= start)
            return;
        int mid = start + (end - start) / 2;
        sort(array, start, mid);
        sort(array, mid + 1, end);
        merge(array, start, mid, end);
    }

    private static <T extends Comparable<T>> void merge(T[] array, int start, int mid, int end) {
        int firstStart = start;
        int firstEnd = mid;
        int secondStart = mid + 1;
        int secondEnd = end;
        int length = end - start + 1;
        int writer = 0;

        @SuppressWarnings("unchecked")
        T[] buffer = (T[]) java.lang.reflect.Array.newInstance(array.getClass().getComponentType(), length);

        while (firstStart <= firstEnd && secondStart <= secondEnd) {
            if (array[firstStart].compareTo(array[secondStart]) == -1) {
                buffer[writer] = array[firstStart++];
            } else {
                buffer[writer] = array[secondStart++];
            }
            writer++;
        }
        while (firstStart <= firstEnd) {
            buffer[writer] = array[firstStart++];
            writer++;
        }
        while (secondStart <= secondEnd) {
            buffer[writer] = array[secondStart++];
            writer++;
        }
        writer = 0;
        for (int i = start; i <= end; i++) {
            array[i] = buffer[writer];
            writer++;
        }
    }
}
