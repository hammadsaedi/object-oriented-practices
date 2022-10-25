package Lab_Tasks.Lab_5.Task_3;

public class App {
    public static void main(String[] args) {
        Person p1 = new Person("Hammad", "Saeedi", new Address(1, 1, "Khanewal"));
        System.out.println(p1);

        Person p2 = new Person(p1);
        System.out.println(p2);

        System.out.println(p1.equals(p2));

        p2.setAddress(new Address(0, 0, "Islamabad"));

        System.out.println(p2);

        System.out.println(p2.isBorgor());
    }
}
