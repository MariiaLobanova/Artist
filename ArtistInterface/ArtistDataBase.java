package ArtistInterface;

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
    public List<Artist> searchByName(String name) {
        List<Artist> matchingArtists = new ArrayList<>();

        for (Artist artist : artists) {
            if (artist.getName().equalsIgnoreCase(name)) {
                matchingArtists.add(artist);
            }
        }

        return matchingArtists;
    }



    public List<Artist> getallArtists() {
        return artists;
    }
}
