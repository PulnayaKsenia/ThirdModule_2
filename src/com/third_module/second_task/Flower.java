package com.third_module.second_task;

public class Flower {
    private String name;

    public Flower(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "This Flower is " + name;
    }
}
