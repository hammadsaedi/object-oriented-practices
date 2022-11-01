package Lab_Tasks.Lab_6.Task_3;

public class Tape extends Publication {
    private int time;

    public Tape(){}

    public Tape(String title, double price, int time) {
        super(title, price);
        this.time = time;
    }
    
    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return super.toString() + " Tape [Time: " + time + "]";
    }
}
