package Lab_2.Task_5;
import java.util.Arrays;

public class Book {
    String author;
    String[] chapters;

    
    public Book() {
        this.author = "Hammad Saeedi - @hammadsaedi everywhere";
        this.chapters =  new String[5];
    }


    public Book(String author, int noOfChapters) {
        this.author = author;
        this.chapters =  new String[noOfChapters];
    }
    
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getChapters( int chapterNo) {
        return chapters[chapterNo];
    }

    public void setChapters(String chapterName, int chapterNo) {
        this.chapters[chapterNo] = chapterName;
    }

    public int getChaptersNo(){
        return this.chapters.length;
    }

    public boolean isAuthorNameStartWithA(){
        return Character.toLowerCase(this.author.charAt(0)) == 'a';
    }

    @Override
    public String toString() {
        return "Book [Author: " + author + ", Chapters: " + Arrays.toString(chapters) + "]";
    }

    

    
}
