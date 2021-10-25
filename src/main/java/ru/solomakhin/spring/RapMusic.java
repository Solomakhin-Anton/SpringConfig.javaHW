package ru.solomakhin.spring;


public class RapMusic implements Music {
    private RapMusic(){}

    public static RapMusic getRapMusic(){
        return new RapMusic();
    }

    @Override
    public String getSong() {
        return "Rap";
    }
}
