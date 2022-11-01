package Lab_Tasks.Lab_6.Task_3;

import java.util.Objects;

public class Publication {
    private String title;
    private double price;

    public Publication(){
        this("Java - How to Program!", 100);
    }

    public Publication(final String title, final double price) {
        if (Objects.isNull(title)) throw new RuntimeException();
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(final double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Publication [Title: " + title + ", Price: " + price + "]";
    }
}
