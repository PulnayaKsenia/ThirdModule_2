package com.third_module.second_task;

public class Tulip extends Flower {
    private String country;

    public Tulip(String nameOfFlower, BouquetOfFlowers bouquet) {
        super(nameOfFlower, bouquet);
    }

    @Override
    public String toString() {
        return "Tulips from " + country;
    }
}
