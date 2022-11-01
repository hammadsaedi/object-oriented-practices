package Lab_Tasks.Lab_6.Task_3;

public class Book extends Publication {
    private int pages;
    
    public Book(){}

    public Book(String title, double price, int pages) {
        super(title, price);
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return super.toString() + " Book [Pages: " + pages + "]";
    }
}
