package ru.solomakhin.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        RockMusic rockMusic = context.getBean("musicBean", RockMusic.class);

        System.out.println(rockMusic.getSong());

        ClassicalMusic classicalMusic = context.getBean("musicBean2", ClassicalMusic.class);

        System.out.println(classicalMusic.getSong());

        RapMusic rapMusic = context.getBean("musicBean3", RapMusic.class);

        System.out.println(rapMusic.getSong());

////        Music music = context.getBean("musicBean", Music.class);
////        MusicPlayer musicPlayer = new MusicPlayer(music);
////
//        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//        System.out.println(firstMusicPlayer == secondMusicPlayer); // true
//        System.out.println(firstMusicPlayer); // ru.solomakhin.spring.MusicPlayer@7a419da4
//        System.out.println(secondMusicPlayer); // ru.solomakhin.spring.MusicPlayer@7a419da4
//
//        firstMusicPlayer.setVolume(10);
//
//        System.out.println(firstMusicPlayer.getVolume()); // 10
//        System.out.println(secondMusicPlayer.getVolume()); // 10
//
//        musicPlayer.playMusic();

        context.close();
    }
}
