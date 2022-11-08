package Lab_Tasks.Lab_7.Task_3;

import java.util.Objects;

public abstract class Person {
    private String name;

    
    public Person(String name) {
        if (Objects.isNull(name)) throw new NullPointerException();
            this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (Objects.nonNull(name))
            this.name = name;
    }
    
    public abstract boolean isOutstanding();

    @Override
    public String toString() {
        return "Person [Name: " + name + "]";
    }
}
