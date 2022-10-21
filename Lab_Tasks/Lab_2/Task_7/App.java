package Lab_Tasks.Lab_2.Task_7;

public class App {
    public static void main(String[] args) {
        University uni = new University();
        System.out.println(uni);
        System.out.println(uni.checkIfLocationInCapital());
        System.out.println(uni.searchDepartment(0));
        System.out.println(uni.setDepartment("Fin Tech"));
        System.out.println(uni);

        University uni2 = new University("CUI", "Ali");
        System.out.println(uni2);
        System.out.println(uni2.checkIfLocationInCapital());
        try {
            System.out.println(uni2.searchDepartment(0));

        } catch (Exception e){
            System.out.println(e);
        }
        System.out.println(uni2.setDepartment("Fin Tech"));
        System.out.println(uni2);

        University uni3 = new University("Comsats", "Islamabad", "Umar", new String[]{"CS", "EE", "Physics", "English", "Urdu"});
        System.out.println(uni3);
        System.out.println(uni3.checkIfLocationInCapital());
        System.out.println(uni3.searchDepartment(0));
        System.out.println(uni3.setDepartment("Fin Tech"));
        System.out.println(uni3);
    }
}
