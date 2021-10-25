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
//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        MusicPlayer musicListPlayer = context.getBean("musicListPlayer", MusicPlayer.class);

//        musicPlayer.playMusic();

        musicListPlayer.playMusicList();

//        System.out.println(musicPlayer.getName()); // 1) Some name 2) Second name
//        System.out.println(musicPlayer.getVolume()); // 1) 50 2) 70

        context.close();
    }
}
