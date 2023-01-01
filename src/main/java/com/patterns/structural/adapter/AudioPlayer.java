package com.patterns.structural.adapter;

public class AudioPlayer implements MediaPlayer{

    private MediaAdapter mediaAdapter;


    @Override
    public void play(String file) {
        mediaAdapter = new MediaAdapter();
        mediaAdapter.play(file);
    }
}
