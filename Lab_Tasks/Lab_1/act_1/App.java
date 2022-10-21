package act_1;


public class App {
    public static void main(String[] args) {
        CourseResult[] result = new CourseResult[2];

        result[0] = new CourseResult();
        result[0].id = 1;
        result[0].studentName = "Hammad Saeedi";
        result[0].courseName = "OOPs";
        result[0].grade = "A";

        result[1] = new CourseResult();
        result[1].id = 2;
        result[1].studentName = "Fareh Iqbal";
        result[1].courseName = "OOPs";
        result[1].grade = "A";

        System.out.println(result[0]);
        System.out.println();
        System.out.println(result[1]);
    }
}
