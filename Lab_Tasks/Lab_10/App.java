package Lab_Tasks.Lab_10;

import java.io.IOException;

public class App {

    public static void main(String[] args) {
        Database db = new Database();
        Operations operation = new Operations("Lab_Tasks/Lab_10/db");

        // a
        db.add(new Student("Hammad", "faoqzuhair@gmail.com", "male", "FA21-BCS-023", 3.33, 3, new Department("Computer Science", "Near Physics Department")));
        db.add(new Student("Ali", "ali@gmail.com", "male", "FA21-BCS-013", 1, 3, new Department("Computer Science", "Near Physics Department")));
        db.add(new Student("Ahmed", "ahmed@gmail.com", "male", "FA21-CYS-016", 4, 1, new Department("Cyber Security", "Near Physics Department")));
        db.add(new Student("Ayesha", "ayesha@gmail.com", "female", "SP22-PYS-018", 3.66, 2, new Department("Physics Department", "Near CS Department")));
        
        // b
        System.out.println(db);

        try {
            operation.push(db);   
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
        

        // c
        try {
            db = (Database) operation.seek();
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }

        System.out.println(db);


        // d
        System.out.println(db.searchAStudent("FA21-BCs-023"));

        // e
        System.out.println(db.deleteAStudent("FA21-BCs-023"));

        // f
        db.updateMail("FA21-BCS-013", "ali@yahoo.com");

        // g
        db.updateDepartment("SP22-PYS-018", "Computer Science");
    
        // h
        System.out.println(db.countAllStudentOnProb());

        // i
        db.displayAllStudentsInDepartment("Computer Science");

        // j 
        db.deleteAllStudentsInDepartment("Cyber Security");

        System.out.println(db);
    }
}
