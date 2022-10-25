package Lab_Tasks.Lab_5.Task_1;

public class App {
    public static void main(String[] args) {
        Employee e1 = new Employee("Hammad", "Saeedi", new Date(), new Date(1,1,2000));
        System.out.println(e1);

        Employee e2 = new Employee(e1);
        System.out.println(e2);

        System.out.println("Is Equals: " + e1.equals(e2));

        System.out.println("Is Experienced: " + e1.isExperienced());
    }
}
