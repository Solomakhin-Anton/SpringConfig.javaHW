package ru.solomakhin.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

////        Music music = context.getBean("musicBean", Music.class);
////        MusicPlayer musicPlayer = new MusicPlayer(music);
//
        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(firstMusicPlayer == secondMusicPlayer); // true
        System.out.println(firstMusicPlayer); // ru.solomakhin.spring.MusicPlayer@7a419da4
        System.out.println(secondMusicPlayer); // ru.solomakhin.spring.MusicPlayer@7a419da4

        firstMusicPlayer.setVolume(10);

        System.out.println(firstMusicPlayer.getVolume()); // 10
        System.out.println(secondMusicPlayer.getVolume()); // 10

        MusicPlayer firstNewMusicPlayer = context.getBean("musicPlayer2", MusicPlayer.class);
        MusicPlayer secondNewMusicPlayer = context.getBean("musicPlayer2", MusicPlayer.class);

        System.out.println(firstNewMusicPlayer == secondNewMusicPlayer); // false
        System.out.println(firstNewMusicPlayer); // ru.solomakhin.spring.MusicPlayer@33990a0c
        System.out.println(secondNewMusicPlayer); // ru.solomakhin.spring.MusicPlayer@4de4b452

        firstNewMusicPlayer.setVolume(10);

        System.out.println(firstNewMusicPlayer.getVolume()); // 10
        System.out.println(secondNewMusicPlayer.getVolume()); // 70

//        musicPlayer.playMusic();

        context.close();
    }
}
