package Lab_2.Task_5;

public class Book {
    String author;
    String[] chapters = new String[5];

    /**
     * Instantiate Book
     * author => Hammad Saeedi - @hammadsaedi everywhere
     * Chapters:
     * 1- Object and Classes
     * 2- Inheritance
     * 3- Polymorphism and Encapsulation
     * 4- Abstraction and Interfaces
     * 5- Generics
     */
    public Book() {
        this.author = "Hammad Saeedi - @hammadsaedi everywhere";
        chapters[0] = "Object and Classes";
        chapters[1] = "Inheritance";
        chapters[2] = "Polymorphism and Encapsulation";
        chapters[3] = "Abstraction and Interfaces";
        chapters[4] = "Generics";
    }

    /**
     * Instantiate Book with given prams
     * @param author must not null if so, object instantiate with author => Hammad Saeedi - @hammadsaedi everywhere
     * @param chapters String array. Recommended Length 5; Object can only hold 5. If more than 5 pass later will be skipped. If less than 5 passed other will be null; 
     */
    public Book(String author, String[] chapters) {
        if (author != null){
            this.author = author;
        } else {
            this.author = "Hammad Saeedi - @hammadsaedi everywhere";
        }
        int n = chapters.length;
        if (chapters.length > this.chapters.length){
            n = this.chapters.length;
        }
        for (int i = 0; i < n; i++) {
            this.chapters[i] = chapters[i];
        }
    }
    
    /**
     * @return author of book
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Set Author of Book
     * @param author must not null if so there will be no change on state level
     */
    public void setAuthor(String author) {
        if (author != null){
            this.author = author;
        }
    }

    /**
     * Get Chapter Name
     * @param chapterNo 
     * @throws ArraysIndexOutOfBoundsException if chapter Number passed is less than 0 or higher than 4
     * @throws NullPointerException if try to access no initialized chapters
     * @return Chapter Name
     */
    public String getChapters(int chapterNo) {
        // return (chapterNo >= 0 || chapterNo < chapters.length)?chapters[chapterNo]:null;
        // return chapters[chapterNo];
        if (chapters[chapterNo] != null){
            return chapters[chapterNo];
        }
        throw new NullPointerException();
    }

    /**
     * Set Non-Initialized Chapter Names
     * @param chapterName Append at last; If capacity (5) is filled no addition will take place
     * @return true if chapter is added
     */
    public boolean setChapters(String chapterName) {
        for (int i = 0; i < this.chapters.length; i++) {
            if (this.chapters[i] == null){
                this.chapters[i] = chapterName;
                return true;
            }
        }
        return false;
    }

    /**
     * @return true; If author name start with a
     */
    public boolean isAuthorNameStartWithA(){
        return Character.toLowerCase(this.author.charAt(0)) == 'a';
    }

    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("Book [Author: " + author + ", Chapters: [");
        for (int i = 0; i < chapters.length; i++) {
            if (chapters[i] != null){
                buffer.append(chapters[i] + ", ");
                continue;
            } 
            break;
        }
        buffer.append("]");
        return buffer.toString();
    }    
}
