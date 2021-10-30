package ru.solomakhin.spring;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class RapMusic implements Music {

    @PostConstruct
    public void doMyInit() {
        System.out.println("Init");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Destroy");
    }

    @Override
    public String getSong() {
        return "Rap";
    }
}
