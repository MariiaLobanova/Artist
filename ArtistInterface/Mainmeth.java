package ArtistInterface;

import java.util.List;
import java.util.Scanner;

public class Mainmeth {
    public static void main(String[] args) {
        ArtistDataBase artistDataBase = new ArtistDataBase();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            StringBuilder menu = new StringBuilder();
            menu.append("And what do you want to do now?\n");
            menu.append("add - To add a new artist\n");
            menu.append("rm -  To remove an artist\n");
            menu.append("se -  To search an artist\n");
            menu.append("ls -  To show a list of artists\n");
            menu.append("ex -  Exit\n");

            System.out.println(menu.toString());

            String choice = scanner.nextLine();
            scanner.nextLine();

            switch (choice) {
                case "add":
                    System.out.println("Type a new name of Artist");
                    String name = scanner.nextLine();
                    System.out.println("Type an age of Artist");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Type a genre");
                    String genre = scanner.nextLine();

                    Artist newArtist = new ArtistImplementation(name, age, genre);
                    artistDataBase.addArtist(newArtist);
                    System.out.println("The Artist is added");
                    break;

                case "rm":
                    System.out.println("Type a name for removing");
                    String artistName = scanner.nextLine();
                    List<Artist> artistsToRemove = artistDataBase.searchByName(artistName);

                    if (!artistsToRemove.isEmpty()) {
                        artistDataBase.removeArtist(artistsToRemove.get(0));
                        System.out.println("The artist is removed");
                    } else {
                        System.out.println("The Artist is not found");
                    }
                    break;

                case "se":
                    System.out.println("Type a name of Artist for searching");
                    String searchName = scanner.nextLine();
                    List<Artist> searchResults = artistDataBase.searchByName(searchName);

                    if (searchResults.isEmpty()) {
                        System.out.println("Results of searching is "+ searchResults);
                        for (Artist artist : searchResults) {
                            System.out.println("Name" + artist.getName());
                        }
                    } else {
                        System.out.println("not found");
                    }
                    break;

                case "ls":
                    List<Artist> allArtists = artistDataBase.getallArtists();
                    if (!allArtists.isEmpty()) {
                        System.out.println("The List of artists: ");
                        for (Artist artist : allArtists) {
                            System.out.println("Name  " + artist.getName() + "  Age  " + artist.getAge() + "  Genre  " + artist.getGenre());
                            System.out.println();
                        }
                    } else {
                        System.out.println("The list of artists is empty");
                        System.out.println();
                    }
                    break;

                case "ex":
                    System.out.println("Exit");
                    System.exit(0);
                    break;

                default:
                    System.out.println("type is not correct, try again");
                    break;
            }
        }
    }


}




