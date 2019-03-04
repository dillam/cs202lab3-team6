public class Song {

  String name;
  String artist;
  String genre;
  int year;
  int rank;

  public Song(String name, String artist, String genre, int year, int rank) {
    this.name = name.toUpperCase();
    this.artist = artist.toUpperCase();
    this.genre = genre;
    this.year = year;
    this.rank = rank;
  }//constructor1

  //return the name
  public String getName() {
    return this.name;
  }

  //return the artist
  public String getArtist() {
    return this.artist;
  }

  //return the genre
  public String getGenre() {
    return this.genre;
  }

  //return the year
  public int getYear() {
    return this.year;
  }

  //return the rank
  public int getRank() {
    return this.rank;
  }

  //return the ascii value of the character at index i in the name
  public int getCharName(int i) {
    return this.name.charAt(i);
  }

  //return the ascii value of the character at index i in the artist
  public int getCharArtist(int i) {
    return this.artist.charAt(i);
  }

  //return the ascii value of the first character in the genre
  public int getCharGenre() {
    return this.genre.charAt(0);
  }
}
