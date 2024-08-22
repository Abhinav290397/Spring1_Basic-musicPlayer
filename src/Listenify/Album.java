package Listenify;

import java.util.List;

public class Album {
    private String albumName;
    private String artistName;
    public List<Song>songsList;

    public Album(String albumName, String artistName, List<Song>songsList){
        this.albumName = albumName;
        this.artistName = artistName;
        this.songsList = songsList;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public List<Song> getSongsList() {
        return songsList;
    }

    public void setSongsList(List<Song> songsList) {
        this.songsList = songsList;
    }

    @Override
    public String toString() {
        return "Album{" +
                "albumName='" + albumName + '\'' +
                ", artistName='" + artistName + '\'' +
                ", songsList=" + songsList +
                '}';
    }

    public boolean findSongsInAlbum(String title){
        //traverse using for Each loop on songsList and get the song.
        for(Song x : getSongsList() ){
            if(x.getTitle().equals(title)){
                return true;
            }
        }
        return false;
    }

    //Add songs in album
    public String addSongsInAlbum(Song song){
        //chk if song is already present or not.
        boolean isSongPresent = findSongsInAlbum(song.getTitle());
        if(isSongPresent){
            return "Song is already present";
        }
        else{
            //Song not present ,Add song in songsList.
            songsList.add(song);
            return "New song has been added successfully";
        }
    }
}
