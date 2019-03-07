import java.util.*;
import java.io.*;

public class PlaylistProcessor {

  public static void main(String[] args) {
    Song[] songs = new Song[30];
    songs = run(songs);

    for (int i = 0; i < 30; i++) {
      System.out.println(i + ": " + songs[i].getSong());
    }
  }

  public static Song[] run(Song[] songs) {
    //Variables
    int count = 0;
    //File readers
    BufferedReader scanFile = null;
    FileReader file = null;
    try {
      file = new FileReader("data/playlist.txt");
      scanFile = new BufferedReader(file);
      String name, artist, genre;
      int year, rank;
      String[] song;

      for (int i = 0; i < 30; i++) {
        song = scanFile.readLine().split(",");
        songs[i] = new Song(song[0], song[1], song[2], Integer.parseInt(song[3]), Integer.parseInt(song[4]));
      }

      return songs;

    } //try
    catch (IOException e) {
      e.printStackTrace();
      return songs;
    } //catch
    finally {
			try {
				if (scanFile != null)
					scanFile.close();

				if (file != null)
					file.close();

        return songs;
			} //try
      catch (IOException ex) {
				ex.printStackTrace();
        return songs;
			} //catch
    } //finally
  } //run

} //class
