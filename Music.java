public class MusicArtist implements ArtistInterface {

    private String name;
    private String musicGenre;

    public MusicArtist(String name, String musicGenre) {
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
}