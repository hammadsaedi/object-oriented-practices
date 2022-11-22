package Lab_Tasks.Lab_8.Task_2;

public class App {
    public static void main(String[] args) {
        Payable invoice = new Invoice(10, "Keys", "H key for Keyboard.", 100);
        Payable employee = new SalariedEmployee("Hammad", "Saeedi", "FA21-BCS-023", 100);

        System.out.println(invoice.getPayableAmount());
        System.out.println(employee.getPayableAmount());
    }
}
