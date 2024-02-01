package org.arkAcademy.week2.Day7.Ch1;

abstract class AudioPlayer implements Playable {
    private int volume;

    public AudioPlayer() {
        this.volume = 50; // Default volume
    }
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Volume set to " + volume);
        }
    }
