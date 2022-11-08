package Lab_Tasks.Lab_7.Task_4;

public class FahrenheitToCelsius extends Conversion {
    public FahrenheitToCelsius(double original, double converted) {
        super(original, converted);
    }

    @Override
    public void compute() {
        super.setConverted((getOriginal() - 32)* 0.5556);        
    }
}
