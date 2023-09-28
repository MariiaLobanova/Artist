package Library;

//Attributes: name, borrowedBooks
//Methods: borrowBook(), returnBook()

public class Member {

    private String name;
    private String borrowBook;

    public Member(String name, String borrowedBook) {
        this.name = name;
        this.borrowBook = borrowedBook;
    }

    public void borrowBook() {
        System.out.println(name + "took a book " + borrowBook);
    }

    public void returnBook() {
        System.out.println(name + "has to return the book" + borrowBook + "in 2 week");
    }
}