package com.third_module.second_task;

import java.util.List;

public class BouquetOfFlowers {
    private List<Flower> flowers;

    public BouquetOfFlowers(List<Flower> flowers) {
        this.flowers = flowers;
    }

    public List<Flower> getFlowers() {
        return flowers;
    }

    public void setFlowers(List<Flower> flowers) {
        this.flowers = flowers;
    }

    public void add(Flower flower) {
        flowers.add(flower);
    }
}
