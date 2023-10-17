package Library;
// Create a Book class with fields like id, title, isbn, and author.
public class BookClass {

    @ISBN
    private String isbn;
    @BookInfo
    private String title;
    @BookInfo
    private String author;
    @BookInfo
    private  int yearPublished;

    public BookClass(String isbn, String title, String author, int yearPublished) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public void info (String name, String title, String autor, int yearPublished){

    }
}




