package ru.solomakhin.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.*;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer musicPlayer  = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer.getName()); // Some name
        System.out.println(musicPlayer.getVolume()); // 70

        ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);
        ClassicalMusic classicalMusic2 = context.getBean("classicalMusic", ClassicalMusic.class);

        System.out.println(classicalMusic1 == classicalMusic2); // true

        RockMusic rockMusic1 = context.getBean("rockMusic", RockMusic.class);
        RockMusic rockMusic2 = context.getBean("rockMusic", RockMusic.class);

        System.out.println(rockMusic1 == rockMusic2); // false

        RapMusic rapMusic = context.getBean("rapMusic", RapMusic.class);
        // Init
        // Some name
        // 70
        // true
        // false
        // Destroy

        context.close();
    }
}
