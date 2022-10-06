package Lab_3.Task_4;

public class App {
    public static void main(String[] args) {
        Account account1 = new Account(100);
        Account account2 = new Account(account1.getBalance());
        System.out.println(account1);
        System.out.println(account2);
    }
}
