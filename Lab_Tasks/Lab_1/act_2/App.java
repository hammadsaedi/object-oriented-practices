package Lab_Tasks.Lab_1.act_2;

public class App {
    static Date date1;
    static Date date2;

    public static void main(String[] args) {
        date1 = new Date();
        date2 = new Date();

        date1.date = 20;
        date1.month = 9;
        date1.year = 2022;

        date2.date = 25;
        date2.month = 12;
        date2.year = 2004;

        System.out.println(date1);
        System.out.println();
        System.out.println(date2);
    }
    

    
}
