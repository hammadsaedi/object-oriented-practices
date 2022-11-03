package Lab_Tasks.Lab_6.Task_6;

import Lab_Tasks.Lab_5.Task_3.Address;

public class App {
    public static void main(String[] args) {
        Student std = new Student("Hammad Saeedi", new Address(10, 20, "Khanewal"), "03325122004", "faoqzuhair@gmail.com", "True?");
        System.out.println(std);
    }
}
