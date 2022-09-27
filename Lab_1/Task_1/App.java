package Task_1;

import act_2.Date;

public class App {
    public static void main(String[] args) {
        Student student = new Student();
        Date date = new Date();

        student.id = "FA21-BCS-023";
        student.name = "Hammad Saeedi";

        date.date = 25;
        date.month = 12;
        date.year = 2004;

        student.dob = date;
        student.department = "Computer Science";
        student.program = "BS Computer Science"; 

        System.out.println(student);
    }
}
