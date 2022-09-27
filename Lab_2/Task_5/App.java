package Lab_2.Task_5;
public class App {
    public static void main(String[] args) {
        Book book1 = new Book();
        System.out.println(book1);

        Book book2 = new Book("Ali", 2);
        System.out.println(book2);

        System.out.println(book1.isAuthorNameStartWithA());
        System.out.println(book2.isAuthorNameStartWithA());

        for (int i = 0; i < book1.getChaptersNo(); i++) {
            book1.setChapters(Integer.toBinaryString(i), i);
        }
        System.out.println(book1);
    }
}
