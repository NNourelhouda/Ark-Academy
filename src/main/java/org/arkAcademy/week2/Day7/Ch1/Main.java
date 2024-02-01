package org.arkAcademy.week2.Day7.Ch1;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
            MusicLibrary library = new MusicLibrary();
        MP3Player mp3Player = new MP3Player();
        CDPlayer cdPlayer = new CDPlayer();

            library.addSong(new Song("Stairway to Heaven", "Led Zeppelin"));
            library.addSong(new Song("Imagine", "John Lennon"));
            library.addSong(new Song("All by Myself", "Eric Carmen"));

            System.out.println("All songs:");
            for (Song song: library.getSongs()) {
                System.out.println(song.getTitle() + " by " + song.getArtist());
            }
        cdPlayer.play();
        cdPlayer.pause();
        cdPlayer.stop();

        mp3Player.play();
        mp3Player.pause();
        mp3Player.stop();

        library.play();
        library.pause();
        library.stop();

        }
    }
