package Lab_Tasks.Lab_5.Task_4;

import Lab_Tasks.Lab_5.Task_3.Address;
import Lab_Tasks.Lab_5.Task_3.Person;

public class App {
    public static void main(String[] args) {
        Book book = new Book("My Life, My Ruler!", new Person("Hammad", "Saeedi", new Address(1, 1, "Khanewal")), new Person("Ali", "Muhammad", new Address(1, 1, "Islamabad")));
        System.out.println(book);
        
        Person author = book.getAuthor();
        book.setAuthor(new Person(author.getFirstName(), author.getLastName(), new Address(150, 20, "Khanewal")));        

        System.out.println(book);
    }
}
