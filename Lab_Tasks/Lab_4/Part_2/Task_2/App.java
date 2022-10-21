package Lab_Tasks.Lab_4.Part_2.Task_2;

public class App {
    public static void main(String[] args) {
        Account account = new Account();
        Account account2 = new Account(account);

        System.out.println(account);
        System.out.println(account2);

        System.out.println(account == account2);
        System.out.println(account.equals(account2));
        // why ?
        
    }
}
