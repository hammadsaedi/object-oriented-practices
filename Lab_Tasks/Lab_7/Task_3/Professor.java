package Lab_Tasks.Lab_7.Task_3;

public class Professor extends Person {
    private int publications;

    public Professor(String name, int publications) {
        super(name);
        this.publications = publications;
    }
    
    public int getPublications() {
        return publications;
    }

    public void setPublications(int publications) {
        this.publications = publications;
    }

    @Override
    public boolean isOutstanding() {
        return Double.doubleToLongBits(publications) > Double.doubleToLongBits(3.5);
    }
}
