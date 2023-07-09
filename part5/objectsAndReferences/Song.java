package part5.objectsAndReferences;

public class Song {

  private String groupName;
  private String songName;
  private int releaseYear;

  public Song(String groupName, String songName, int releaseYear) {
    this.groupName=groupName;
    this.songName=songName;
    this.releaseYear=releaseYear;
  }

  public boolean equals(Object compared) {
    if(this == compared) {
      return true;
    }

    if(!(compared instanceof Song)) {
      return false;
    }

    Song comparedSong = (Song) compared;

    if(this.groupName.equals(((Song) compared).groupName)
        && this.songName.equals(((Song) compared).songName)
        && this.releaseYear==(((Song) compared).releaseYear)) {

      return true;
    }
    return false;
  }

}
