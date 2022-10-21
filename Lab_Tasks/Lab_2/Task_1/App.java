package Lab_Tasks.Lab_2.Task_1;

public class App {
    public static void main(String[] args) {
        Account account1 = new Account();
        System.out.println(account1);

        Account account2 = new Account(12000);
        System.out.println(account2);
        
        Account account3 = new Account(12000, 2020, "36103-41o0071-1");
        System.out.println(account2);

        System.out.println(account3.calculateAgeOfAccount());

        account3.deposit(189);
        System.out.println(account3);

        account3.withdraw(1500);
        System.out.println(account3);

        try {
            account3.withdraw(15000);
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
