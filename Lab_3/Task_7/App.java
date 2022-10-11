package Lab_3.Task_7;

public class App {
    public static void main(String[] args) {
        University uni1 = new University();
        University uni2 = new University("CUI", "Islamabad", "Ali", new String[]{"CS", "EE", "Physics"});

        System.out.println(uni1);
        System.out.println(uni2);

        if (uni1.getDepartments().length > uni2.getDepartments().length) {
            System.out.println(uni1.getName());
        } else if (uni1.getDepartments().length < uni2.getDepartments().length)  {
            System.out.println(uni2.getName());
        } else {
            System.out.println("Both have same number of department.");
        }

        if(uni1.getLocation().equals(uni2.getLocation())) System.out.println("Both have same Location.");
    }
}
