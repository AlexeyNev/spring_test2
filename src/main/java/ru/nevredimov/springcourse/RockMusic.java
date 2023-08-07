package ru.nevredimov.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "KISS";
    }

}
