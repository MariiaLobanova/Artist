import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArtistDataBase {
    private List<Artist> artists = new ArrayList<>();

    public void addArtist(Artist artist){
        artists.add(artist);
    }
    public void removeArtist(Artist artist){
        artists.remove(artist);
    }
    public List<Artist>searchByName(String name){
        return artists.stream()
                .filter(artist -> artist.getName().equalsIgnoreCase(name))
                .collect(Collectors.toList());
    }

    public List<Artist> getallArtists() {
        return artists;
    }
}
