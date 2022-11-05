package Playground.Inheritance.PrivateOverRiding;

public class Child extends Parent {
    private int x;
    
    // Not Override; Just got hidden
    // @Override
    private void increment(){
        x++;
    }

    // Not Override; Just got hidden
    // @Override
    private void decrement(){
        x++;
    }

    @Override
    public int getX(){
        return x;
    }

    @Override
    public void setX(int x){
        if (x > this.x){
            int temp = this.x;
            while(x != temp){
                increment();
                x--;
            }
        } else if (x < this.x){
            int temp = this.x;
            while(x != temp){
                decrement();
                x++;
            }
        }
        this.x++;
    }
}
