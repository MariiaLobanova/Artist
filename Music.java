public class Music implements ArtistInterface{

    private String name;
    private String musicGenre;
    private String nameSong;

    public Music(String name, String musicGenre) {
        this.name = name;
        this.musicGenre = musicGenre;
    }

    @Override
    public void perform() {
        System.out.println("Artist's Genre is " + musicGenre);
    }

    @Override
    public void displayInfo() {
        System.out.println("Artist's name is " + name);
    }
    @Override
    public void addSong(String nameSong){
       System.out.println("Song is added" + nameSong);
    }

}