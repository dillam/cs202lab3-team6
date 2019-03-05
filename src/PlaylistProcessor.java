import java.util.*;
import java.io.*;

public class PlaylistProcessor {
  //Arrays
  String[] name = new String[30];
  String[] artist = new String[30];
  String[] genre = new String[30];
  int[] year = new int[30];
  int[] rank = new int[30];

  public static void main(String[] args) {
    PlaylistProcessor play = new PlaylistProcessor();
    play.run(args);
  }

  public void run (String[] args) {
    //Variables
    int count = 0;
    //File readers
    BufferedReader scanFile = null;
    FileReader file = null;
    try {
      file = new FileReader("data/playlist.txt");
      scanFile = new BufferedReader(file);
      String tempLine;

      while ((tempLine = scanFile.readLine()) != null) {
        String[] lineSplit = tempLine.split(", ");
        name[count] = lineSplit[0];
        artist[count] = lineSplit[1];
        genre[count] = lineSplit[2];
        year[count] = Integer.parseInt(lineSplit[3]);
        rank[count] = Integer.parseInt(lineSplit[4]);
        count++;
      } //while loop
    } //try
    catch (IOException e) {
      e.printStackTrace();
    } //catch
    finally {
			try {
				if (scanFile != null)
					scanFile.close();

				if (file != null)
					file.close();
			} //try
      catch (IOException ex) {
				ex.printStackTrace();
			} //catch
    } //finally
  } //run

  public String[] getName() {
    return name;
  } //getName

  //return the artist
  public String[] getArtist() {
    return artist;
  } //getArtist

  //return the genre
  public String[] getGenre() {
    return genre;
  } //getGenre

  //return the year
  public int[] getYear() {
    return year;
  } //getYear

  //return the rank
  public int[] getRank() {
    return rank;
  } //getRank

} //class
