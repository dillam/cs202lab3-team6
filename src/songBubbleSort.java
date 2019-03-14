import java.util.*;

public class songBubbleSort {
  
  public static void bubbleSort(int[] songs) {
    BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
    do{
      swapped = false;
      for (int i =0; i < songs.length - 1; i++){
        if (songs[i] > songs[i+1]){
          int temp = songs[i];
          songs[i] = songs[i+1];
          songs[i+1] = temp;
          swapped = true;
        }
        writer.write(songs);
      }
    } while(swapped);
  }// end bubbleSort

  public sortBy (String input, Song[] songList) {
    int[] temp;
    if (input.toLowerCase.equals("rank")){
      for (int i = 0; i < songList.length - 1; i++) {
        temp[i] = Song.getRank();
      }
    }

    if (input.toLowerCase.equals("name")){
      for (int i = 0; i < songList.length - 1; i++) {
        temp[i] = Song.getCharName(0);
      }
    }

    if (input.toLowerCase.equals("artist")){
      for (int i = 0; i < songList.length - 1; i++) {
        temp[i] = Song.getCharArtist(0);
      }
    }

    if (input.toLowerCase.equals("genre")){
      for (int i = 0; i < songList.length - 1; i++) {
        temp[i] = Song.getCharGenre();
      }
    }

    if (input.toLowerCase.equals("year")){
      for (int i = 0; i < songList.length - 1; i++) {
        temp[i] = Song.getYear();
      }
    }

    return bubbleSort(temp);
  }

}// end songBubbleSort
