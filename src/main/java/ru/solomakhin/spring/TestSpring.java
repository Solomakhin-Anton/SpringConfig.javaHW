package ru.solomakhin.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Music rock = context.getBean("rock", Music.class);
        Music classic =  context.getBean("classicalMusic", Music.class);

        MusicPlayer firstMusicPlayer = new MusicPlayer(rock);
        MusicPlayer secondMusicPlayer = new MusicPlayer(classic);

        firstMusicPlayer.playMusic(); //Playing: Rock
        secondMusicPlayer.playMusic(); //Playing: Classic

        context.close();
    }
}
