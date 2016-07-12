package com.third_module.second_task;

public class Flower {
    private String nameOfFlower;
    private BouquetOfFlowers bouquet;

    public Flower(String nameOfFlower, BouquetOfFlowers bouquet) {
        this.nameOfFlower = nameOfFlower;
        this.bouquet = bouquet;
        bouquet.add(new Tulip(nameOfFlower, bouquet));
        bouquet.add(new Chamomile(nameOfFlower, bouquet));
    }

    @Override
    public String toString() {
        return "These Flowers " + nameOfFlower + "add to the bouquet " + bouquet;
    }
}
