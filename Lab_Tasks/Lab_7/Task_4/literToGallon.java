package Lab_Tasks.Lab_7.Task_4;

public class literToGallon extends Conversion {
    public literToGallon(double original, double converted) {
        super(original, converted);
    }

    @Override
    public void compute() {
        super.setConverted(getOriginal() * 0.264172);        
    }
}
