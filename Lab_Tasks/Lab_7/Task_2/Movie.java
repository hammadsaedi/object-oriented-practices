package Lab_Tasks.Lab_7.Task_2;

import java.util.Objects;

public abstract class Movie {
    private int id;
    private String title;
    private int numberOfDays;

    private static int counter = 0;

    public Movie(String title, int numberOfDays) {
        if (Objects.isNull(title)) 
            throw new NullPointerException();
        this.id = ++counter;
        this.title = title;
        this.numberOfDays = numberOfDays;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (Objects.nonNull(title))
            this.title = title;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!Movie.class.isInstance(obj))
            return false;
        Movie other = (Movie) obj;
        if (!title.equals(other.title))
            return false;
        if (numberOfDays != other.numberOfDays)
            return false;
        return true;
    }

    public abstract double calculateLateFee(int days);

    @Override
    public String toString() {
        return "Movie [ID: " + id + ", Title: " + title + ", Number Of Days: " + numberOfDays + "]";
    }
}
