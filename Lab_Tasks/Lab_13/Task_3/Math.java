package Lab_Tasks.Lab_13.Task_3;

import java.util.ArrayList;

public class Math<T extends Number> {
    ArrayList<T> list;

    public Math(ArrayList<T> list) {
        this.list = list;
    }

    public Double standardDeviation() {
        Double sum = 0.0, average = 0.0, standardDeviation = 0.0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i).doubleValue();
        }
        average = sum / list.size();
        for (int i = 0; i < list.size(); i++) {
            standardDeviation += java.lang.Math.pow(list.get(i).doubleValue() - average, 2);
        }
        standardDeviation /= list.size();
        standardDeviation = java.lang.Math.pow(standardDeviation, 5);
        return standardDeviation;
    }
}
