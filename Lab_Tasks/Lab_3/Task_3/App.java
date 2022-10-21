package Lab_Tasks.Lab_3.Task_3;

public class App {
    public static void main(String[] args) {
        Student s1 = new Student("Hammad Saeedi", new double[]{90, 95, 91});
        System.out.println(s1);
        
        s1.setMarks(93);
        System.out.println(s1);

        Student s2 = new Student("Ali", new double[]{90, 95, 94});
        System.out.println(s2);

        Student s3 = new Student(s1.getName(), s2.getMarks());
        System.out.println(s3);
        
        s3.setMarks(98);
        System.out.println(s3);
        System.out.println(s2);
    }
}
