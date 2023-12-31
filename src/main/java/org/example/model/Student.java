package org.example.model;

import org.example.aspects.Loggable;

public class Student {
    private String name;

    public String getName() {
        return name;
    }


@Loggable
    public void setName(String firstName) {
        this.name = firstName;
    }
    public void throwException(){
        throw new RuntimeException("Dummy Exception in Project");
    }

}
