package Lab_Tasks.Lab_6.Task_4;

public class VerifiedSimple extends Simple {
    public VerifiedSimple() {}

    public VerifiedSimple(int num1, int num2) {
        super(num1, num2);
    }

    @Override
    public int add() {
        if (!validateState()) 
            throw new RuntimeException();
        return super.add();
    }

    @Override
    public int divide() {
        if (!validateState()) 
            throw new RuntimeException();
        return super.divide();
    }

    @Override
    public int multiply() {
        if (!validateState()) 
            throw new RuntimeException();        
        return super.multiply();
    }

    @Override
    public int subtract() {
        if (!validateState()) 
            throw new RuntimeException();
        return super.subtract();
    }
    
    private boolean validateState(){
        return super.getNum1() > 0 && super.getNum2() > 0;
    }
}
