package Playground.Inheritance.Parse;

public class Child extends Parent {
    protected int num;

    Child(int num){
        super(num);
        this.num = num;
    }

    @Override
    int getNum(){
        return num;
    }
}
