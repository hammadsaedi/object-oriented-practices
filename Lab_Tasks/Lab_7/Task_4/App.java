package Lab_Tasks.Lab_7.Task_4;

public class App {
    public static void main(String[] args) {
        Conversion[] conversions = new Conversion[3];

        conversions[0] = new literToGallon(12, 0);
        conversions[1] = new FahrenheitToCelsius(12, 0);
        conversions[2] = new FeetToMeters(12, 0);

        for (int i = 0; i < conversions.length; i++) {
            conversions[i].compute();
        }
        for (int i = 0; i < conversions.length; i++) {
            System.out.println(conversions[i].getConverted());
        }
    }
}
