package com.third_module.second_task;

public class Aster extends Flower {
    private int number;

    public Aster(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Number of Aster: " + number;
    }
}
