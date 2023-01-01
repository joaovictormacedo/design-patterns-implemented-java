package com.patterns.structural.adapter;

public class Main {

    public static void main(String[] args) {

        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("sucess.mp3");
        audioPlayer.play("sucess.mp4");
        audioPlayer.play("err.vlc");
        audioPlayer.play("sucess.mp3");

    }
}
