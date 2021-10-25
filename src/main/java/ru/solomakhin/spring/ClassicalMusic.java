package ru.solomakhin.spring;

public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Classic";
    }

    public void doMyInit(){
        System.out.println("Init Classic");
    }

    public void doMyDestroy(){
        System.out.println("Destroy Classic");
    }
}
