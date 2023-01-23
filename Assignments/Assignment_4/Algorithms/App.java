package Assignments.Assignment_4.Algorithms;

import java.util.Arrays;
import Assignments.Assignment_3.Circle;
import Assignments.Assignment_3.Rectangle;

public class App {
    public static void main(String[] args) {
        Single[] singles = new Single[] { new Single(22), new Single(12), new Single(18), new Single(43), new Single(8),
                new Single(15) };
        // System.out.println(Arrays.toString(singles));
        // Algorithms.bubbleSort(singles);
        // Algorithms.selectionSort(singles);
        // System.out.println(Arrays.toString(singles));
        // Algorithms.insertionSort(singles);
        // System.out.println(Arrays.toString(singles));

        System.out.println(Arrays.toString(singles));
        Algorithms.mergeSort(singles);
        System.out.println(Arrays.toString(singles));

        // Rectangle[] rectangles = new Rectangle[] { new Rectangle(false, "black", 1,
        // 2, 3),
        // new Rectangle(false, "black", 4, 29, 3), new Rectangle(false, "black", 0, 2,
        // 38),
        // new Rectangle(false, "black", 2, 2, 3) };
        // Circle[] circles = new Circle[] { new Circle(false, "green", 3, 2), new
        // Circle(false, "green", 50, 2),
        // new Circle(false, "green", 1, 26), new Circle(false, "green", 9, 5),
        // new Circle(false, "green", 1, 81) };
        // Algorithms.selectionSort(rectangles);
        // Algorithms.bubbleSort(circles);

        // System.out.println(Arrays.toString(rectangles));
        // System.out.println(Arrays.toString(circles));

        // for (int i = 0; i < circles.length; i++) {
        // System.out.println(circles[i].volume());
        // }

        // for (int i = 0; i < rectangles.length; i++) {
        // System.out.println(rectangles[i].volume());
        // }
    }
}
