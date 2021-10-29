package ru.solomakhin.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

import static ru.solomakhin.spring.MusicTypes.CLASSICAL;
import static ru.solomakhin.spring.MusicTypes.ROCK;

@Component
public class MusicPlayer {
    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music1,
                       @Qualifier("rockMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic(MusicTypes type) throws Exception {
        Random random = new Random();
        if (type == CLASSICAL) return "Playing: " + music1.getSong().get(random.nextInt(3));
        if (type == ROCK) return "Playing: " + music2.getSong().get(random.nextInt(3));
        throw new Exception("Incorrect music type");
    }
}
