package org.arkAcademy.week2.Day7.Ch1;
import java.util.ArrayList;
public class MusicLibrary implements Playable {
    private ArrayList < Song > songs;
    public MusicLibrary() {
        songs = new ArrayList < Song > ();
    }
    public void addSong(Song song) {
        songs.add(song);
    }
    public ArrayList< Song > getSongs() {
        return songs;
    }

    @Override
    public void play() {
        System.out.println("Playing song");
    }

    @Override
    public void pause() {
        System.out.println("Pausing song");

    }

    @Override
    public void stop() {
        System.out.println("Stopping song");

    }
}
