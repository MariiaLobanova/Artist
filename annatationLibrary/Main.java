package annatationLibrary;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Member member = new Member("dog@email.com");
        Member member2 = new Member("hgfkll");
        Library library= new Library();

        //System.out.println(member.isValidEmail("dog@email.com"));
        //System.out.println(member2.isValidEmail("hgfkll"));
        boolean isEmailvalid= member.isValidEmail("ghjjkutgfd@gmail.com");
        boolean isEmailvalid2= member.isValidEmail("ttt@gmail.com");
        boolean isEmailvalid3= member.isValidEmail("ttt@g");

        boolean isMemberValid=member.isMemberValid("Monica", 3);
        boolean isMemberValid1=member.isMemberValid("Lucas", 2);
        boolean isMemberValid2=member.isMemberValid("Anton", 18);

        boolean CheckAmountBooks=member.CheckAmountBooks("Anna",1);
        boolean CheckAmountBooks1=member.CheckAmountBooks("Bella",5);
        boolean CheckAmountBooks2=member.CheckAmountBooks("Luisa",3);



        Book book1= new Book("1239876543211", "Harry Potter", 123, "Rowling");
        Book book2=new Book("345123456789", "Pippi Strumphose", 234, "Lingren");
        Book book3=new Book("345123456789", "Gruffalo", 234, "Ann");
        Book book4=new Book("345123456789", "cuisine", 234, "thh");

      //  boolean valid1 = book1.isISBNValid("1234567890000");
       // boolean valid2 = book1.isISBNValid("123");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        List<Book> bookByAuthor=library.findBookByAuthor("Ann");

        List<Book> bookByTitle=library.findBookByTitle("Gruffalo");

        library.removeBook(book4);
        library.removeBook(book3);


        library.displayBooks();




        //System.out.println(book1.isISBNValid("1234567891234"));
        //System.out.println(book2.isISBNValid("987654321"));


    }
}
