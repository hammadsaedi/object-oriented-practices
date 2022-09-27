package Lab_2.Task_6;

public class App {
    public static void main(String[] args) {
        Student std1 = new Student();
        
        System.out.println(std1);
        
        System.out.println(std1.checkProb());
        std1.setGPA(2);
        System.out.println(std1.checkProb());

        std1.setEmail("faoqzuhair@gmail.com");
        System.out.println(std1.validateEmail());
        
        std1.setEmail("faoqzuhair@gmailcom");
        System.out.println(std1.validateEmail());

        for (int i = 0; i < std1.getSubjectNo(); i++) {
            std1.setSubjects(Integer.toHexString(i + 123), i);
        }

        System.out.println(std1);

    }
}
