package Lab_Tasks.Lab_5.Task_4;

import java.util.Objects;

import Lab_Tasks.Lab_5.Task_3.Person;

public class Book {
    private String name;
    private Person author;
    private Person publisher;

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        if (Objects.nonNull(name))
            this.name = name;
    }
    
    public Person getAuthor() {
        return new Person(author);
    }
    
    public void setAuthor(Person author) {
        if (Objects.nonNull(author))
            this.author = new Person(author);
    }
    
    public Person getPublisher() {
        return new Person(publisher);
    }
    
    public void setPublisher(Person publisher) {
        if (Objects.nonNull(publisher))
            this.publisher = new Person(publisher);
    }
    
    
}
