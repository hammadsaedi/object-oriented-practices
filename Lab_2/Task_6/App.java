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
        try {
            std1.setEmail("faoqzuhairgmailcom");
        } catch (RuntimeException e) {
            System.out.println(e);
        }
        System.out.println(std1.validateEmail());

        System.out.println(std1.setSubjects("DS"));
        System.out.println(std1);

        Student std2 = new Student("Ali", 3.75f, new String[]{"ICT", "English", "DS", "Islamiate"}, "faoq@gmail.com");
        System.out.println(std2);
        System.out.println(std2.setSubjects("AP"));
        System.out.println(std2);

        Student std3 = null;
        try {
            std3 = new Student("Hammad Saeedi", -1, new String[]{}, "faoq");
        } catch (RuntimeException e) {
            System.out.println(std3);
            System.out.println(e);
        }
        System.out.println(std3);
    }
}
