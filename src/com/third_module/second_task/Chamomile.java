package com.third_module.second_task;

public class Chamomile extends Flower {
    private int number;

    public Chamomile(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Number of Chamomile: " + number;
    }
}
