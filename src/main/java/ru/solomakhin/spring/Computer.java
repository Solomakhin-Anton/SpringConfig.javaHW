package ru.solomakhin.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

import static ru.solomakhin.spring.MusicTypes.CLASSICAL;
import static ru.solomakhin.spring.MusicTypes.ROCK;

@Component
public class Computer {
    private int id;
    private MusicPlayer musicPlayer;

    @Autowired
    public Computer(MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        System.out.println("Please select a type of music: 1 if CLASSICAL or 2 if ROCK");
        Scanner console = new Scanner(System.in);
        int typeNumber = console.nextInt();
        try {
            if (typeNumber == 1) return "Computer " + id + " " + musicPlayer.playMusic(CLASSICAL);
            if (typeNumber == 2) return "Computer " + id + " " + musicPlayer.playMusic(ROCK);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Incorrect number";
    }
}
