package ru.nevredimov.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    @PostConstruct
    public void doMyInit() {
        System.out.println("doMyInit");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("doMyDestroy");
    }

    @Override
    public String getSong() {
        return "Bogemian Phapsody";
    }
}
