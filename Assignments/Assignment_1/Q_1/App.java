package Assignments.Assignment_1.Q_1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student s1 = new Student();
        Student s2 = new Student("fa12-bcs-023", "Hammad", 90, 100);
        
        // System.out.println(s1);
        // System.out.println(s2);

        System.out.println("Enter details for Student 2: ");
        
        System.out.print("Registration Number: ");
        s1.setRegistrationNumber(input.nextLine());

        System.out.print("Name: ");
        s1.setName(input.nextLine());

        System.out.print("Total Marks: ");
        s1.setTotalMarks(Float.parseFloat(input.nextLine()));

        System.out.print("Enter Obtained Marks: ");
        s1.setObtainedMarks(Float.parseFloat(input.nextLine()));

        System.out.println(s1.grades());
        System.out.println(s2.grades());

        input.close();
    }
}
