package Assignments.Assignment_4.Algorithms;

import java.util.Objects;

public class Single implements Comparable<Single> {
    private int i;

    public Single(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public int compareTo(Single o) {
        if (Objects.isNull(o))
            throw new RuntimeException("Cannot compare NULL");
        if (i > o.i)
            return 1;
        if (i < o.i)
            return -1;
        return 0;
    }

    @Override
    public String toString() {
        return "Single [I: " + i + "]";
    }
}
