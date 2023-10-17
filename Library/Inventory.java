package Library;

public class Inventory {

    @IsAvailable
    public boolean checkAvailability(BookClass bookclass){
        return true;
    }
    @ValidateUser
    public boolean registerUser(int age) {
        return age>=18;
    }
    @ValidateUser
    public  boolean borrowBook(Member member, BookClass bookclass){
        return true;
    }

}
