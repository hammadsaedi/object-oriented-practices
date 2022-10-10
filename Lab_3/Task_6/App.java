package Lab_3.Task_6;

public class App {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1);

        Student s2 = new Student("Ali", 4, new String[]{"DSA", "OOP"}, "ali@gmail.com");
        System.out.println(s2);

        if(s1.getGPA() > s2.getGPA()) System.out.println("s1 has higher percentage.");
        else if(s1.getGPA() < s2.getGPA()) System.out.println("s2 has higher percentage.");
        else System.out.println("Both have same.");

        String[] subjects = s1.getSubjects();
        for (int i = 0; i < subjects.length; i++) {
            if(s2.searchSubject(subjects[i])) System.out.println("Both study " + subjects[i]);   
        }
    }
}
