public class ArtistImplementation implements Artist {
    private String name;
    private int age;
    private String genre;

    public ArtistImplementation (String name, int age, String genre) {
        this.name = name;
        this.age = age;
        this.genre = genre;
    }
    @Override
            public String getName(){
        return name;
    }
    @Override
    public int getAge(){
        return age;
    }
    @Override
    public String getGenre(){
        return genre;
    }
}
