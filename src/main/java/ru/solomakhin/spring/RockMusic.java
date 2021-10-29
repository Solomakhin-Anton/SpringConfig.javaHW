package ru.solomakhin.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {
//    @Override
//    public String getSong() {
//        return "Rock";
//    }

    List<String> songs = new ArrayList<>();

    {
        songs.add("Rock 1");
        songs.add("Rock 2");
        songs.add("Rock 3");
    }

    @Override
    public List<String> getSong() {
        return songs;
    }
}
