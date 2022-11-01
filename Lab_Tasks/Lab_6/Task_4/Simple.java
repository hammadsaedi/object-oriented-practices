package Lab_Tasks.Lab_6.Task_4;

public class Simple {
    private int num1;
    private int num2;

    public Simple(){
        this(0, 0);
    }
    
    public Simple(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }
    
    public void setNum1(int num1) {
        this.num1 = num1;
    }
    
    public int getNum2() {
        return num2;
    }
    
    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int add(){
        return num1 + num2;
    }

    public int subtract(){
        return num1 - num2;
    }

    public int multiply(){
        return num1 * num2;
    }

    public int divide(){
        return num1 / num2;
    }

    @Override
    public String toString() {
        return "Simple [First Number: " + num1 + ", Second Number: " + num2 + "]";
    }
}
