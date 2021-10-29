package ru.solomakhin.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.*;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Computer computer = context.getBean("computer", Computer.class);

        System.out.println(computer);

        /*
         Можно реализовать без ввода с клавиатуры:
         MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
         musicPlayer.playMusic(MusicGenre.CLASSICAL);
         musicPlayer.playMusic(MusicGenre.ROCK);
         */

        context.close();
    }
}
