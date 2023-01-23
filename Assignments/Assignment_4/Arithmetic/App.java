package Assignments.Assignment_4.Arithmetic;

public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
        Trio<Integer, Double, Float> trio = new Trio<Integer, Double, Float>(1, 2.3, 5.9f);
        System.out.println(trio);
        System.out.println(trio.multiplication());
        System.out.println(trio.addition());

        Trio<Integer, Double, Float> other = new Trio<Integer, Double, Float>(5, 3.5, 9.5f);
        System.out.println(other);
        System.out.println(other.multiplication());
        System.out.println(other.addition());

        System.out.println(trio.compareTo(other));

        @SuppressWarnings("unchecked")
        Trio<Integer, Double, Float> clone = (Trio<Integer, Double, Float>) trio.clone();
        System.out.println(clone.equals(trio));
        clone.setFirst(10);
        System.out.println(clone.equals(trio));
    }
}
