public class SongSorter {
  public static void main(String[] args) {
    Song[] songs = new Song[30];
    songs = PlaylistProcessor.run(songs);

    for (int i = 0; i < 30; i++) {
      System.out.println(i + ": " + songs[i].getSong());
    }
  }

  public static Song[] shellSort(Song[] songs) {
    return songs;
  }
}
