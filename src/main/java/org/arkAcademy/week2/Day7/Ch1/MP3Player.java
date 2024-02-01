package org.arkAcademy.week2.Day7.Ch1;

public class MP3Player extends AudioPlayer {
    @Override
    public void play() { System.out.println("Playing audio from MP3 file");}
    @Override
    public void pause() { System.out.println("Pausing audio from MP3 file");}
    @Override
    public void stop() { System.out.println("Stopping audio from MP3 file");}

}
