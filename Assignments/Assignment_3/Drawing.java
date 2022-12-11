package Assignments.Assignment_3;

import java.util.ArrayList;

public class Drawing extends ArrayList<GeometricObject> {

    public double area() {
        double area = 0;
        for (int i = 0; i < size(); i++){
            area += get(i).area();
        }
        return area;
    }

    public int filledObjects() {
        int count = 0;
        for (int i = 0; i < size(); i++){
            if (get(i).isFilled()) count++;
        }
        return count;
    }
}


    
