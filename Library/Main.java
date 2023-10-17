package Library;

public class Main {
        public static void main(String[] args) {


            BookClass bookClass= new BookClass("ISBN123", "Harry Potter", "Rawling", 1990);
            Member member = new Member("example@gmail.com");
            Inventory inventory = new Inventory();


            boolean isAvailable = inventory.checkAvailability(bookClass);
            boolean registered = inventory.registerUser(20);
            boolean borrowed = inventory.borrowBook(member, bookClass);

            System.out.println("ISBN"+bookClass.getIsbn()+"Title"+bookClass.getTitle()+"Autor"+bookClass.getAuthor());

            System.out.println("Is Book Available: " + isAvailable);
            System.out.println("User Registered: " + registered);
            System.out.println("Borrowed Book: " + borrowed);
        }

}
