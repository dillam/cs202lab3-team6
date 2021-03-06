import java.util.*;
import java.io.*;

public class PlaylistProcessor {

  // parses data file and returns array of song class populated with the songs
  public static Song[] run(Song[] songs) {
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
