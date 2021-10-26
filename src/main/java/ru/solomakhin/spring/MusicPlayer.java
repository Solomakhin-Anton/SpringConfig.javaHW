package ru.solomakhin.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic) {
        this.classicalMusic = classicalMusic;
    }

    public void playMusic() {
        System.out.println("Playing: " + classicalMusic.getSong());
    }

//    private Music music;
//
//    @Autowired
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }
//
//    public void playMusic() {
//        System.out.println("Playing: " + music.getSong());
//    }
}
