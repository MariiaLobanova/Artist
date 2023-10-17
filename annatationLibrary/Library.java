package annatationLibrary;

import java.util.*;

public class Library {
    private List<Book> books;
    private Map<Integer,Book> bookMap;
    private List<Member> members;
    private Set<Book> favoriteBooks;
    public Library(){
        books= new ArrayList<>();
        bookMap=new HashMap<>();
        members= new ArrayList<>();
    }
    public void addBook(Book book){
        books.add(book);
        bookMap.put(book.getId(),book);
    }
    public Book findBookById(int id){
        return bookMap.get(id);
    }
    public void removeBook(Book book){
        books.remove(book);
        bookMap.remove(book.getId());
    }
    public List<Book> findBookByAuthor(String author){
        List<Book> result = new ArrayList<>();
        for (Book book:books) {
            if(book.getAuthor().equals(author)){
                result.add(book);
            }
        }
        return result;
    }
    public List<Book> findBookByTitle(String title){
        List<Book> result =new ArrayList<>();
        for (Book book:books) {
            if(book.getTitle().equals(title)){
                result.add(book);
            }
        }
        return result;
    }
    public void displayBooks(){
        System.out.println("the books are: ");
        for (Book book:books) {
            System.out.println("Id "+book.getId()+ " Title "+ book.getTitle()+ "Author "+ book.getAuthor());
        }
    }



}
