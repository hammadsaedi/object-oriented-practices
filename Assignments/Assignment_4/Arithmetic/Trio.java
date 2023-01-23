package Assignments.Assignment_4.Arithmetic;

import java.util.Objects;

public class Trio<X extends Number, Y extends Number, Z extends Number>
        implements Comparable<Trio<X, Y, Z>>, Cloneable {
    private X first;
    private Y second;
    private Z third;

    public Trio(X first, Y second, Z third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public X getFirst() {
        return first;
    }

    public void setFirst(X first) {
        this.first = first;
    }

    public Y getSecond() {
        return second;
    }

    public void setSecond(Y second) {
        this.second = second;
    }

    public Z getThird() {
        return third;
    }

    public void setThird(Z third) {
        this.third = third;
    }

    public Double addition() {
        return first.doubleValue() + second.doubleValue() + third.doubleValue();
    }

    public Double multiplication() {
        return first.doubleValue() * second.doubleValue() * third.doubleValue();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        @SuppressWarnings("unchecked")
        Trio<X, Y, Z> other = (Trio<X, Y, Z>) obj;
        if (first == null) {
            if (other.first != null)
                return false;
        } else if (!first.equals(other.first))
            return false;
        if (second == null) {
            if (other.second != null)
                return false;
        } else if (!second.equals(other.second))
            return false;
        if (third == null) {
            if (other.third != null)
                return false;
        } else if (!third.equals(other.third))
            return false;
        return true;
    }

    @Override
    public int compareTo(Trio<X, Y, Z> o) {
        if (Objects.isNull(o))
            throw new NullPointerException("Can't compare with NULL");
        if (addition() > o.addition())
            return 1;
        if (addition() < o.addition())
            return -1;
        return 0;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Trio [First: " + first + ", Second: " + second + ", Third: " + third + "]";
    }
}
