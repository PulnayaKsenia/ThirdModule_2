package com.third_module.second_task;

public class Rose extends Flower {
    private String color;

    public Rose(String name) {
        super(name);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "This Rose is " + color;
    }
}
