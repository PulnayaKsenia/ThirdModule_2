package com.third_module.second_task;

public class Chamomile extends Flower {
    private Integer number;

    public Chamomile(String nameOfFlower, BouquetOfFlowers bouquet) {
        super(nameOfFlower, bouquet);
    }

    @Override
    public String toString() {
        return "Number of Chamomile: " + number;
    }
}
