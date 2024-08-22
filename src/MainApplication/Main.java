
package MainApplication;

import java.util.*;
import Listenify.Album;
import Listenify.Song;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static  void playPreviousSong(Album album,String song){
        List<Song> songList = album.getSongsList();
        for(int i=0;i<songList.size();i++){
            if(songList.get(i).getTitle().equals(song)){
                System.out.println("Previoud song is " + songList.get(i-1).getTitle());
            }
        }
    }
    public static void playNextSong(Album album,String song){
        List<Song> songList = album.getSongsList();
        for(int i=0;i<songList.size();i++){
            if(songList.get(i).getTitle().equals(song)){
                System.out.println("Next song is - " + songList.get(i+1).getTitle());
            }
        }
    }
    public static void main(String[] args) {

        List<Song>l1 = new ArrayList<>();
        Song s1 = new Song("Faded",3.2);
        l1.add(s1);
        Song s2 = new Song("On my way",4.25);
        l1.add(s2);
        Song s3 = new Song("see you again",2.58);
        l1.add(s3);

        Album album1 = new Album("English Songs","English Artist",l1);

        System.out.println(album1);

        List<Song>l2 = new ArrayList<>();
        Song s4 = new Song("Baillando",4.22);
        l2.add(s4);
        Song s5 = new Song("Ay vamos",3.55);
        l2.add(s5);
        Song s6 = new Song("Ambiente",4.01);
        l2.add(s6);

        Album album2 = new Album("Spanish Songs", "Spanish Artist", l2);

        System.out.println(album2);

        //Find the song.
        System.out.println("Enter the song name to search");
        Scanner sc = new Scanner(System.in);
        String songName = sc.nextLine();
        boolean isSongPresent = album1.findSongsInAlbum(songName);
        if(isSongPresent){
            System.out.println("Yes the Song"+songName+" is Present in Album");
        }
        else System.out.println("Not Present");

        System.out.println("For next song Press 1 Or press -1 for previous song");
        int n = sc.nextInt();
        if(n==-1){
            playPreviousSong(album1,songName);
        }
        else if(n==1){
            playNextSong(album1,songName);
        }
        else{
            System.out.println("No match found");
        }
    }
}
