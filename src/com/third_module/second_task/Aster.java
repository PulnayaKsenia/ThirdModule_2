package com.third_module.second_task;

public class Aster extends Flower {
    private Integer number;

    public Aster(String nameOfFlower, BouquetOfFlowers bouquet) {
        super(nameOfFlower, bouquet);
    }

    @Override
    public String toString() {
        return "Number of Aster: " + number;
    }
}
