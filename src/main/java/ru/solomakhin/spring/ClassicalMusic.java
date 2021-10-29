package ru.solomakhin.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
//    @Override
//    public String getSong() {
//        return "Classic";
//    }

    List<String> songs = new ArrayList<>();

    // Блок инициализации объекта (англ. Instance initialization block)
    // Выполняется каждый раз, когда создается объект класса
    {
        songs.add("Classical 1");
        songs.add("Classical 2");
        songs.add("Classical 3");
    }

    @Override
    public List<String> getSong() {
        return songs;
    }
}
