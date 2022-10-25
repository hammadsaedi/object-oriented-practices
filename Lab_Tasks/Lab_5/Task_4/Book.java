package Lab_Tasks.Lab_5.Task_4;

import java.util.Objects;

import Lab_Tasks.Lab_5.Task_3.Person;

public class Book {
    private String name;
    private Person author;
    private Person publisher;

    public Book(){
        this(new String(), new Person(), new Person());
    }

    public Book(Book obj){
        this(obj.name, obj.author, obj.publisher);
    }

    public Book(String name, Person author, Person publisher){
        if (Objects.isNull(name) || Objects.isNull(author) || Objects.isNull(publisher)) throw new RuntimeException();
        this.name = name;
        this.author = new Person(author);
        this.publisher = new Person(publisher);
    }

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
    
    public boolean equals(Book obj){
        if (this == obj) 
            return true;
        if (Objects.isNull(obj)) 
            return false;
        if (!this.name.equals(obj.name)) 
            return false;
        if (!this.author.equals(obj.author)) 
            return false;
        if (!this.publisher.equals(obj.publisher))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Book [Name: " + name + ", Author: " + author + ", Publisher: " + publisher + "]";
    }
}
