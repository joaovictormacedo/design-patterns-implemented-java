package com.patterns.structural.adapter;

public class MediaAdapter implements MediaPlayer {

    private AdvancedMediaPlayer audioPlayer;

    @Override
    public void play(String file) {

        if (Utils.getExtension(file).equals("mp3")) {
            audioPlayer = new Mp3Player();
            audioPlayer.playMp3(file);
        } else  if (Utils.getExtension(file).equals("mp4")) {
            audioPlayer = new Mp4Player();
            audioPlayer.playMp4(file);
        } else {
            System.out.println("[Player] File "+ file + " has an unsupported format");
        }

    }
}
