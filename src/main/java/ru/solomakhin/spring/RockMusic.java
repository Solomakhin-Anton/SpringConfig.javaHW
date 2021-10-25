package ru.solomakhin.spring;

import org.springframework.stereotype.Component;

@Component("rock")
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Rock";
    }

    public void doMyInit(){
        System.out.println("Init Rock");
    }

    public void doMyDestroy(){
        System.out.println("Destroy Rock");
    }
}
