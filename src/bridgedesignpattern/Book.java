
package bridgedesignpattern;

public class Book {
    private static int SEQUENTIAL = 1001;
    private String author;
    private String title;
    private String description;
    private int bookCode;

    public Book(String author, String title, String description) {
        this.author = author;
        this.title = title;
        this.description = description;
        bookCode = SEQUENTIAL++;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getBookCode() {
        return bookCode;
    }
    
    @Override
    public String toString(){
        return ("Author: " + getAuthor() + ", title: " + getTitle() + ", Description: " + getDescription());
    }
}
