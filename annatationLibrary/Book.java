package annatationLibrary;

//Требования:Создайте класс Book с полями id, title, isbn и author.
//Создайте класс Member с полями id, name и email.

import Library.BookInfo;
import Library.ISBN;

import java.util.regex.Pattern;

public class Book {
    private int id;
    @BookInfo
    private String title;

    @ISBN
    private String isbn;
    @BookInfo
    private String author;

    public Book(String isbn, String title, int id, String author) {

        this.isbn = isbn;
        this.title = title;
        this.id= id;
        this.author= author;
    }

    public int getId() {
        return id;
    }
    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }



    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public static boolean isISBNValid(String isbn) {
        String cleanedISBN = isbn.replaceAll("-", "");
        if (cleanedISBN.length() != 13) {

            System.out.println("ISBN"+ isbn+" is not valid");
            return false;
        } else {
            System.out.println("ISBN is " + isbn + " is valid");
            return  true;
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

}
