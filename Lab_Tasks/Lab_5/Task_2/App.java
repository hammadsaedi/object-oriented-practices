package Lab_Tasks.Lab_5.Task_2;

public class App {
    public static void main(String[] args) {
        Employee e1 = new Employee("Hammad", "Saeedi", new Date(), new Date(1,1,2000), new Job());
        System.out.println(e1);

        Employee e2 = new Employee(e1);
        System.out.println(e2);

        System.out.println("Is Equals: " + e1.equals(e2));

        System.out.println("Is Experienced: " + e1.isExperienced());
        
        System.out.println("Greater than 50k: " + e1.greaterThan50k());

        e1.setSalary(51000);

        System.out.println("Greater than 50k: " + e1.greaterThan50k());

    }
}
