package annatationLibrary;

import Library.Email;
import Library.ValidateUser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Member {
    private String name;
    private int id;
    @Email
    private String email;
    private int age;
    private int books;

    public Member(String email) {
        this.email = email;
    }

    public boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            System.out.println("Email is valid :" + email);
            return true;
        } else {
            System.out.println("Email is not valid" +email);
            return false;
        }
    }
    @ValidateUser
    public boolean isMemberValid(String name, int age){
     if (age>3){
         System.out.println("Member "+ name+" can borrow a book");
         return true;
     }else{
         System.out.println("It is impossible. Member"+ name+" is too young");
         return false;
     }
    }
    public boolean CheckAmountBooks(String name, int books){
        if (books>5){
            System.out.println("Member"+name+"can't take another book. He already took"+books+"books");
            return true;
        }else{
            System.out.println("Member"+name+"can take a book"+ "he took"+books+"books");
            return true;
        }
    }
}
