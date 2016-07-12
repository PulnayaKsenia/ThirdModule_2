package com.third_module.second_task;

public class Rose extends Flower {
    private String color;
    private RoseTree roseTree;

    public Rose(String nameOfFlower, BouquetOfFlowers bouquet) {
        super(nameOfFlower, bouquet);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public RoseTree getRoseTree() {
        return roseTree;
    }

    public void setRoseTree(RoseTree roseTree) {
        this.roseTree = roseTree;
    }

    @Override
    public String toString() {
        return color + "Roses on the " + roseTree;
    }
}
