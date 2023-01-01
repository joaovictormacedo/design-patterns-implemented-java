package com.patterns.structural.adapter;

public class Mp3Player implements AdvancedMediaPlayer {

    @Override
    public void playMp3(String file) {
        System.out.println("[Mp3Player] Playing "+file);
    }

    @Override
    public void playMp4(String file) {
        throw new UnsupportedOperationException("Use Mp4Player Class");
    }
}
