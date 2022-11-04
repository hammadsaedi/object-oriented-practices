package Playground.Inheritance.PrivateOverRiding;

public class Parent {
    private int x;
    
    private void increment(){
        x++;
    }

    private void decrement(){
        x++;
    }

    public int getX(){
        return x;
    }

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
    }
}
