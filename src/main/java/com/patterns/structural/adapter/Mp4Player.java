package com.patterns.structural.adapter;

public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playMp3(String file) {
        throw new UnsupportedOperationException("Use Mp3Player Class");
    }

    @Override
    public void playMp4(String file) {
        System.out.println("[Mp4Player] Playing "+file);
    }
}
