package Lab_Tasks.Lab_7.Task_3;

public class App {
    public static void main(String[] args) {
        Person[] persons = new Person[2];

        persons[0] = new Student("Hammad Saeedi", 3.6);
        persons[1] = new Professor("Hammad Saeedi", 51);
        for (int i = 0; i < persons.length; i++){
            System.out.println(persons[i].isOutstanding());
        }

        ((Professor) persons[1]).setPublications(100);
        System.out.println(persons[1].isOutstanding());
    }
}
