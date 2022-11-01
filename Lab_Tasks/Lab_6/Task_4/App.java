package Lab_Tasks.Lab_6.Task_4;

public class App {
    public static void main(String[] args) {
        VerifiedSimple cal = new VerifiedSimple(1, 2);
        System.out.println(cal.add());
        cal.setNum1(0);
        System.out.println(cal.add());
    }
}
