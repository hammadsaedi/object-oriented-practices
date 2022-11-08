package Lab_Tasks.Lab_7.Task_1;

public class App {
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];
        
        employees[0] = new WeeklyEmployee("Hammad", "Saeedi", "FA21-BCS-023", 500);
        employees[1] = new HourlyEmployee("Hammad", "Saeedi", "FA21-BCS-023", 50, 10);
        employees[2] = new CommissionEmployee("Hammad", "Saeedi", "FA21-BCS-023", 15, 20);
        employees[3] = new BasePlusCommissionEmployee("Hammad", "Saeedi", "FA21-BCS-023", 15, 20, 100);

        for (int i = 0; i < employees.length; i++) {
            if (Lab_Tasks.Lab_7.Task_1.BasePlusCommissionEmployee.class.isInstance(employees[i]))
                ((BasePlusCommissionEmployee) employees[i]).setSalary(200);
            System.out.println(employees[i].getClass().getName() + ": "+ employees[i].earning());
        }
    }
}
