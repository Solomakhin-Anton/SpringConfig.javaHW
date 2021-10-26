package ru.solomakhin.spring;

import org.springframework.stereotype.Component;

//@Component("rock")
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Rock";
    }
}
