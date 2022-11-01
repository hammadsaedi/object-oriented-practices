package Lab_Tasks.Lab_6.Task_2;

public class App {
    public static void main(String[] args) {
        BasePlusCommisionEmployee em = new BasePlusCommisionEmployee("Hammad", "Saeedi", "FAOQ-12345", 10, 20, 30);
        System.out.println(em);
        System.out.println(em.earnings());

        CommisionEmployee em2 = new CommisionEmployee("Hammad", "Saeedi", "FAOQ-12345", 10, 20);
        System.out.println(em2);
        System.out.println(em2.earnings());
    }
}
