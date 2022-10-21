package Lab_Tasks.Lab_3.Task_5;

public class App {
    public static void main(String[] args) {
        Marks m1 = new Marks(90, 98, 95);
        Marks m2 = new Marks(99, 90, 94);
        System.out.println(m1);
        System.out.println(m2);        
        
        if(m1.getPercentage() > m2.getPercentage()) System.out.println("m1 has higher percentage.");
        else if(m1.getPercentage() < m2.getPercentage()) System.out.println("m2 has higher percentage.");
        else System.out.println("Both have same.");

        if(m1.getMarks1() > m2.getMarks1()) System.out.println("m1 has higher marks in subject 1.");
        else if(m1.getMarks1() < m2.getMarks1()) System.out.println("m2 has higher marks in subject 1.");
        else System.out.println("Both has same marks.");
    }
}
