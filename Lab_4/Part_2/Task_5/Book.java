package Lab_4.Part_2.Task_5;

import java.util.Arrays;
import java.util.Objects;

public class Book {
    private String author;
    private String[] chapterName = new String[5];

    
    public Book() {
        this(new String(), new String[0]);
    }

    public Book(final String author, final String[] chapterName) {
        if (Objects.isNull(author)) throw new NullPointerException();
        this.author = author;
        if (Objects.isNull(author)) throw new NullPointerException();
        final int size = compatibleArraySize(chapterName);
        for (int i = 0; i < size; i++) {
           this.chapterName[i] = chapterName[i]; 
        }
    }

    public Book(final Book b){
        this(b.getAuthor(), b.getChapterName());
    }

    public int compatibleArraySize(final String[] arr){
        return Math.min(this.chapterName.length, arr.length);
    }

    public String getAuthor() {
        return author;
    }
    
    public void setAuthor(final String author) {
        if (author != null){
            this.author = author;
        }
    }
    
    public String[] getChapterName() {
        return getDeepCopy();
    }  

    public void setChapterName(final String[] chapterName) {
        this.chapterName = chapterName;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Book other = (Book) obj;
        if (author == null) {
            if (other.author != null)
                return false;
        } else if (!author.equals(other.author))
            return false;
        if (!Arrays.equals(chapterName, other.chapterName))
            return false;
        return true;
    }
    
    @Override
    public String toString() {
        return "Book [author=" + author + ", chapterName=" + Arrays.toString(chapterName) + "]";
    }

    public boolean compareAuthor(Book b){
        if (this.author.equals(b.getAuthor())) return true;
        return false;
    }

    private int getSize(){
        int count = 0;
        while (count < chapterName.length) {
            if (Objects.isNull(chapterName[count++])) break;
        }
        return count;
    }

    private String[] getDeepCopy(){
        final String[] temp = new String[getSize()];
        
        for (int i = 0; i < temp.length; i++) {
            temp[i] = this.chapterName[i];    
        }
        
        return temp;
    }

}
