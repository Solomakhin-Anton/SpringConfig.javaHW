package ru.solomakhin.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Classic";
    }
}
