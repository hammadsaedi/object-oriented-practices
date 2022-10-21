package Lab_Tasks.Lab_2.Task_5;
public class App {
    public static void main(String[] args) {
        Book book1 = new Book();
        System.out.println(book1);

        Book book2 = new Book("Ali", new String[]{"Introduction", "Hello World", "Conditions"});
        System.out.println(book2);

        System.out.println(book1.isAuthorNameStartWithA());
        System.out.println(book2.isAuthorNameStartWithA());

        System.out.println(book2.setChapters("Loops"));
        System.out.println(book2.setChapters("Arrays"));
        System.out.println(book2.setChapters("Recursion"));
        System.out.println(book2.setChapters("Intro to Algorithm"));
        
        System.out.println(book2);
    }
}
