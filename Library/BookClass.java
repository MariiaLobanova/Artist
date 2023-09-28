package Library;
//Book Class
//Attributes: title, author, ISBN
//Methods: getBookInfo(), isAvailable()
public class BookClass {
    private String title;
    private String author;
    private String ISBN;
    private boolean available;

    public BookClass() {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.available = available;
    }
    public void getBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Available: " + (available ? "Yes" : "No"));
    }
    public boolean isAvailable() {
        return available;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }
    }
