package org.arkAcademy.week2.Day7.Ch1;

public class CDPlayer extends AudioPlayer{
    @Override
    public void play() { System.out.println("Playing audio from CD ");}
    @Override
    public void pause() { System.out.println("Pausing audio from CD ");}
    @Override
    public void stop() { System.out.println("Stopping audio from CD ");}
}
