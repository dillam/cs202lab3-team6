public class Song {

  String name;
  String artist;
  String genre;
  int year;
  int rank;

  public Song(String name, String artist, String genre, int year, int rank) {
    this.name = name;
    this.artist = artist;
    this.genre = genre;
    this.year = year;
    this.rank = rank;
  }//constructor1

  public String getName() {
    return this.name;
  }

  public String getArtist() {
    return this.artist;
  }

  public String getGenre() {
    return this.genre;
  }

  public int getYear() {
    return this.year;
  }

  public int getRank() {
    return this.rank;
  }

  public char getFirstCharName() {
    return this.name.charAt(0);
  }

  public char getSecCharName() {
    return this.name.charAt(1);
  }

  public char getFirstCharArtist() {
    return this.artist.charAt(0);
  }

  public char getSecCharArtist() {
    return this.artist.charAt(1);
  }
}
