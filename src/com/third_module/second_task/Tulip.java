package com.third_module.second_task;

public class Tulip extends Flower {
    private String country;

    public Tulip(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Tulips from " + country;
    }
}
