package Library;

// Create a Member class with fields like id, name, and email.


public class Member {
    @Email
    private String email;
    private String name;
    private int id;

    public Member(String email) {
        this.email=email;
    }
    public String getEmail(){
        return email;
    }

}
