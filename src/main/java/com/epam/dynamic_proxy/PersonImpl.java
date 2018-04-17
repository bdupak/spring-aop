package com.epam.dynamic_proxy;

public class PersonImpl implements Person {

    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void rename(String newName) {
        if (!newName.equals(name)) {
            this.name = newName;
        }
    }
}
