package com.epam.model;

import com.epam.aspect.CalculateTime;
import com.epam.aspect.Test;

public class Car {
    private String name;
    private String color;

    public String getName() {
        return name;
    }
    @Test
    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @CalculateTime
    public void rename(String newName) {
        if (!name.equals(newName)) {
            name = newName;
        }
    }
}
