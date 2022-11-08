package Lab_Tasks.Lab_7.Task_4;

public class FeetToMeters extends Conversion {
    public FeetToMeters(int original, int converted) {
        super(original, converted);
    }

    @Override
    public void compute() {
        super.setConverted(getOriginal() * 0.3048);
        
    }
    
}
